package Test;

public class R {

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
