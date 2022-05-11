package in.dhananjaygore.patterns.behavioral.strategy_pattern;

public class MainApp {

	public static void main(String[] args) {
		new ShoppingCart().pay(new CreditCardStrategy(), 10);
		new ShoppingCart().pay(new PaypalStrategy(), 10);
	}

}
