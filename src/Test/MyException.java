package Test;

public class MyException extends Exception {
	// �޲������췽��
	public MyException() {
		// TODO Auto-generated constructor stub
		super();
	}

	// �в������췽��
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	// ��ָ������ϸ��Ϣ��ԭ����һ���µ��쳣
	public MyException(String message, Throwable cause) {

		super(message, cause);
	}

	// ��ָ��ԭ����һ���µ��쳣
	public MyException(Throwable cause) {

		super(cause);
	}

}
