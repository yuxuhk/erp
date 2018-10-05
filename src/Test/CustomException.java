package Test;

public class CustomException extends Exception{
	//无参数构造方法
	public CustomException() {
		// TODO Auto-generated constructor stub
		super();
	}
	//有参数构造方法
	public CustomException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
