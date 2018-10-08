package Test;

public class Test {
	public Test(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
		this.Test("s", 1);
	}

	public String Test(String s,int a) {
		System.out.println(s+a);
		return  s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Test  t=new Test("aasAAA");
           
           //System.out.println(t);
	}

}
