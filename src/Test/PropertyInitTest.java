package Test;

public class PropertyInitTest {
          i=new PropertyInitTest();
	// int i = init();

	public int init() {
		return 1;
	}

	public int init(int n) {
		return n + 1;
	}

	public static void main(String[] args) {
		PropertyInitTest t = new PropertyInitTest();
	}
}
