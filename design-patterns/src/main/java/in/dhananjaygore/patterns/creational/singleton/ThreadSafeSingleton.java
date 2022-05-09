package in.dhananjaygore.patterns.creational.singleton;

public class ThreadSafeSingleton {

	// we introduced synchronized keyword on the getInstance method.
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static void main(String[] args) {
		System.out.println(ThreadSafeSingleton.getInstance().hello());
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public String hello() {
		return ("Hello from ThreadSafeSingleton!");
	}
}
