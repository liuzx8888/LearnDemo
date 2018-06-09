package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);
		String sql = "exec Usp_GetDetial ?,?";
		ResultSet rs;
		CallableStatement preparedStatement = conn.prepareCall(sql);
		preparedStatement.setString(1, "1");
		preparedStatement.setString(2, "demo1");

		rs = preparedStatement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String address = rs.getString("address");
			String zip = rs.getString("zip");
			String tel = rs.getString("tel");
			Clob memo = rs.getClob("memo");
			String memo1 = memo.getSubString(1, (int) memo.length());
			System.out.println(id + name + sex + address + zip + tel + memo.getSubString(1, 1000));
		}
	}

}
