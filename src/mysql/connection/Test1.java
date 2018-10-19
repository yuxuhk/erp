package mysql.connection;

public class Test1 {
	public static void main(String[] args) {
		String sql="select *from db";
		Test t=new Test();
		try {
			t.getMysqlConn(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
