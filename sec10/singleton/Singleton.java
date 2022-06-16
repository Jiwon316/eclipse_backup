package sec10.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	// 다른 클래스에서도 접근 가능하도록 스태틱 선언

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

}
