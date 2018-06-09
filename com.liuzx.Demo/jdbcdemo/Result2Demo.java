package jdbcdemo;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Result2Demo {
	public static void main(String[] args) throws Exception {
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);
		String sql = "select * from T_User ";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			psmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rs.absolute(3);
		rs.next();
		rs.previous();
		rs.beforeFirst();
		rs.first();
		rs.last();
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String sex = rs.getString("sex");
		String address = rs.getString("address");
		String zip = rs.getString("zip");
		String tel = rs.getString("tel");
		Clob memo = rs.getClob("memo");
		System.out.println(id + name + sex + address + zip + tel );

	}

}
