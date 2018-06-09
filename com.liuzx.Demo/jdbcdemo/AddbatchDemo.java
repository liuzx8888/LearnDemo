package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class AddbatchDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String drivename = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=TEST_DW";
		String username = "sa";
		String pass = "sa123";
		Connection conn = ConnectUtil.getConnect(drivename, dbURL, username, pass);
		String insertsql = "insert into T_user (id,name,sex,address,zip,tel) Values (?,?,?,?,?,?)";
		PreparedStatement pmt = null;
		Savepoint sp = null;
		if (conn != null) {
			pmt = conn.prepareStatement(insertsql);
			conn.setAutoCommit(false);
			for (int i = 0; i < 10; i++) {
	
				pmt.setInt(1, 9 + i);
				pmt.setString(2, "demo" + i);
				pmt.setString(3, "女");
				pmt.setString(4, "长海医院");
				pmt.setString(5, "224000");
				pmt.setString(6, "13566778899");
				pmt.addBatch();
				if (i == 5) {
					sp = conn.setSavepoint();
				}
			}
			int temp[] = pmt.executeBatch();
			System.out.println(temp.length);
			conn.rollback(sp);
			conn.commit();
			conn.close();
			pmt.close();
		}

	}

}
