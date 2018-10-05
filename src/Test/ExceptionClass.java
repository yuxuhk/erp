package Test;

public class ExceptionClass {
	public String setNum(int num) throws MyException {

		if (num<=0 || num >= 100) {
			return "正常";
		} else {
			throw new MyException("输入错误.....");
		}
	}
}
