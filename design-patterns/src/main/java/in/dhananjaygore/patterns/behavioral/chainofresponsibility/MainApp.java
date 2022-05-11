package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public class MainApp {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		int amount = 530;
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of10s.");
		} else {
			atmDispenser.c1.dispense(amount);
		}
	}
}
