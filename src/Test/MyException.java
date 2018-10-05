package Test;

public class MyException extends Exception {
	
	public MyException() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	
	public MyException(String message, Throwable cause) {

		super(message, cause);
	}

	
	public MyException(Throwable cause) {

		super(cause);
	}

}
