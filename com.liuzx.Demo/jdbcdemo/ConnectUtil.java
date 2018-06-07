package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
	public String drivename;
	public String dbURL;
	public String username;
	public String pass;

	/*
	 * String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; String
	 * dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW"; String
	 * username = "sa"; String pass = "sa123";
	 */

	public ConnectUtil(String drivename, String dbURL, String username, String pass) {
		super();
		this.drivename = drivename;
		this.dbURL = dbURL;
		this.username = username;
		this.pass = pass;
	}

	public static Connection getConnect(String drivename, String dbURL, String username, String pass) {
		try {
			Class.forName(drivename);
			Connection connect = DriverManager.getConnection(dbURL, username, pass);
			return connect;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
