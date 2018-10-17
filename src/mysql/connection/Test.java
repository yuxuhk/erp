package mysql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public void getMysqlConn(String sql) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://10.134.158.244:3306/mysql";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement stat = conn.createStatement();
		//String sql = "select *from user";
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString(1) + "  " + rs.getString(2));
		}
		conn.close();
	}

	
}
