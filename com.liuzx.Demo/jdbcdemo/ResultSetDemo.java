package jdbcdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetDemo {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		String selectsql = "select id,name,sex,address,zip,tel,memo from T_User where id = 1";
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
			Clob memo = rs.getClob("memo");
			String memo1 = memo.getSubString(1, (int) memo.length());
			/*
			 * StringBuffer buffer = new StringBuffer(); InputStream in =
			 * rs.getAsciiStream("memo"); Scanner scanner = new Scanner(in); while
			 * (scanner.hasNext()) { scanner.useDelimiter("\r\n");
			 * buffer.append(scanner.next()).append("\n"); }
			 */
			memo.truncate(1000);
			System.out.println(String.valueOf(id) + name + sex + address + zip + tel + memo.getSubString(1, 1000));
		}

			rs.close();
			statement.close();
			conn.close();

	}

}
