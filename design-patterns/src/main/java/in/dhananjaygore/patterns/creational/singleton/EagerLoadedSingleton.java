package in.dhananjaygore.patterns.creational.singleton;

public class EagerLoadedSingleton {

	//This is costly as object is created at time of class loading,also no scope for exception
	//handling if instantiation fails.
	private static final EagerLoadedSingleton instance = new EagerLoadedSingleton();

	private EagerLoadedSingleton() {
	}

	public static EagerLoadedSingleton getInstance() {
		return instance;
	}

	public String hello() {
		return ("Hello from EagerLoadedSingleton!");
	}

	public static void main(String[] args) {
		System.out.println(EagerLoadedSingleton.getInstance().hello());
	}

}
