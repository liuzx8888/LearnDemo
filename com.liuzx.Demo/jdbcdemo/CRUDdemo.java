package jdbcdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		String path = "D:" + File.separator + "Java" + File.separator + "Demo" + File.separatorChar + "table.sql";
		Statement smt;
		String insertsql = "insert into T_user (id,name,sex,address,zip,tel) Values (1,'张三1','男','江苏','224000','13555555555')"
				+ "insert into T_user (id,name,sex,address,zip,tel) Values (2,'张三2','男','江苏','224000','13555555556')"
				+ "insert into T_user (id,name,sex,address,zip,tel) Values (3,'张三3','男','江苏','224000','13555555557')";
		File f = new File(path);
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StringBuffer buf = new StringBuffer();
		int temp = 0;
		try {
			while ((temp = in.read()) != -1) {
				buf.append((char) temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);

		if (conn != null) {
			try {
				smt = conn.createStatement();
				smt.executeUpdate(buf.toString());
				smt.executeUpdate(insertsql);
				smt.close();
				conn.close();
				in.close();
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
