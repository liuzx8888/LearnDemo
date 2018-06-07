package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		String selectsql = "select id,name,sex,address,zip,tel from T_user";
		ResultSet rs = null;
		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(selectsql);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");			
			String address = rs.getString("address");	
			String zip = rs.getString("zip");	
			String tel = rs.getString("tel");	
			System.out.println(String.valueOf(id) +name+ sex+address+zip+tel);
		}
		
		rs.close();
		statement.close();
		conn.close();

	}

}
