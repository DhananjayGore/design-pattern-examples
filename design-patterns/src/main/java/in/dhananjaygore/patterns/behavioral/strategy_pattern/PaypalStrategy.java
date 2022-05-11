package in.dhananjaygore.patterns.behavioral.strategy_pattern;

public class PaypalStrategy implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Paid by paypal: " + amount);
	}

}
