package mysql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class getCon {
	private String userName = "root";
	private String password = "root";
	private String dirver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://10.134.158.244:3306/mysql";
	private String sql = "select *from user";
	private PreparedStatement pst = null;
	Connection conn = null;
	String row = null;

	public Connection getConnection() {
		try {
			Class.forName(dirver);
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}

	public static void main(String[] args) {
		getCon gc = new getCon();
		List list=	gc.getSelect();
	     for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println(" ");
		}
	     
	}

	public List<String> getSelect() {
		List list=new ArrayList<String>();
		Connection c = getConnection();
		try {
			pst = (PreparedStatement) c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			//rs.last();
			//System.out.println("多少行：" + rs.getRow());
			while (rs.next()) {
				list.add(rs.getString("Host"));
				list.add(rs.getString("user"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
}
