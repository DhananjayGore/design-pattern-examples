package in.dhananjaygore.patterns.creational.singleton;

public class LazyLoadedSingleton {

	// The next step is to use lazy initialization singleton as creating singleton
	// at class loading time and not using it will be costly.
	private static LazyLoadedSingleton instance;

	private LazyLoadedSingleton() {
	}

	public static void main(String[] args) {
		System.out.println(LazyLoadedSingleton.getInstance().hello());
	}

	public static LazyLoadedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLoadedSingleton();
		}
		return instance;
	}

	public String hello() {
		return ("Hello from LazyLoadedSingleton!");
	}
}
