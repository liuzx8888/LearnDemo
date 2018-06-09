package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Result2Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);
		String sql = "select * from T_User ";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		/*
		 * 结果集插入数据
		 */
		try {
			psmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = psmt.executeQuery();
			rs.moveToInsertRow();
			rs.updateInt(1, 4);
			rs.updateString("name", "demo4");
			rs.updateString("sex", "女");
			rs.updateString("address", "长海医院");
			rs.updateString("tel", "12222222222");
			rs.updateString("memo", "memo");
			rs.insertRow();

			rs.last();
			rs.updateInt(1, 5);
			rs.updateString("name", "demo5");
			rs.updateString("sex", "女");
			rs.updateString("address", "长海医院");
			rs.updateString("tel", "12222222222");
			rs.updateString("memo", "memo");
			rs.updateRow();

			rs.first();
			rs.deleteRow();

			rs.close();
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
