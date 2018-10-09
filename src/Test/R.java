package Test;

import org.apache.log4j.Logger;



public class R {
	private static Logger logger = Logger.getLogger(R.class);
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		ExceptionClass ec=new ExceptionClass();
		try {
			String s=ec.setNum(-1);
			System.out.println(s);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
