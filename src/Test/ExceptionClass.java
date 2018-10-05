package Test;

public class ExceptionClass {
	public String setNum(int num) throws MyException {

		if (num<=0 || num >= 100) {
			return "Õı³£";
		} else {
			throw new MyException("ÊäÈë´íÎó.....");
		}
	}
}
