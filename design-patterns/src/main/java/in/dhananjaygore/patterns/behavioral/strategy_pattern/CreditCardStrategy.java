package in.dhananjaygore.patterns.behavioral.strategy_pattern;

public class CreditCardStrategy implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Paid by credit card: " + amount);
	}

}