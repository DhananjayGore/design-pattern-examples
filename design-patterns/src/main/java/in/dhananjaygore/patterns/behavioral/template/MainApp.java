package in.dhananjaygore.patterns.behavioral.template;

public class MainApp {

	public static void main(String[] args) {
		var thief = new HalflingThief(new HitAndRunMethod());
		thief.steal();
		thief.changeMethod(new SubtleMethod());
		thief.steal();
	}
}
