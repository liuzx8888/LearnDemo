package jdbcdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

		String updatesql1 = "update T_User set ? = ?  from T_User  where  ?  = ?";
		String updatesql = "update T_User set name = ?  from T_User  where  id  = ? ";
		String updatetextsql = "update T_User set memo=? from T_User  where  id  = ? ";
		String path1 = "D:" + File.separator + "JavaTest" + File.separator + "ddmm.txt";

		File f = new File(path);
		File f1 = new File(path1);
		PreparedStatement presmt = null;
		PreparedStatement presmttext = null;

		InputStream in = null;
		InputStream in1 = null;
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

		try {
			in1 = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);

		if (conn != null) {
			try {
				smt = conn.createStatement();
				smt.executeUpdate(buf.toString());
				// smt.executeUpdate(insertsql);

				presmt = conn.prepareStatement(updatesql);
				presmttext = conn.prepareStatement(updatetextsql);
				/*
				 * presmt.setString(1,"name"); presmt.setString(2,"demo1");
				 * presmt.setString(3,"id"); presmt.setString(4,"1");
				 */
				presmt.setString(1, "demo1");
				presmt.setString(2, "1");
				int row = presmt.executeUpdate();
				System.out.println(String.valueOf(row));

				presmttext.setAsciiStream(1, in1, (int) f1.length());
				presmttext.setString(2, "1");
				row = presmttext.executeUpdate();
				System.out.println(String.valueOf(row));

				presmttext.close();
				presmt.close();
				smt.close();
				conn.close();
				in.close();
				in1.close();

			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
