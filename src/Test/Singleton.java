package Test;

public class Singleton {

	// 私有构造
	private Singleton() {

	}

	private static Singleton single = null;

	// 双重检查
	private static Singleton getInstance() {
		if (single == null) {
			synchronized (Singleton.class) {
				if (single == null) {
					single = new Singleton();
				}
			}
		}
		return single;
	}
}
