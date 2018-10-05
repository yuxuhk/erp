package Test;

public class MyException extends Exception {
	// 无参数构造方法
	public MyException() {
		// TODO Auto-generated constructor stub
		super();
	}

	// 有参数构造方法
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	// 用指定的详细信息和原因构造一个新的异常
	public MyException(String message, Throwable cause) {

		super(message, cause);
	}

	// 用指定原因构造一个新的异常
	public MyException(Throwable cause) {

		super(cause);
	}

}
