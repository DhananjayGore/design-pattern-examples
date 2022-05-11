package in.dhananjaygore.patterns.behavioral.strategy_pattern;

public class ShoppingCart {

	public void pay(PaymentStrategy paymentMethod, Integer amount) {
		paymentMethod.pay(amount);
	}
}
