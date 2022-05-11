package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 10) {
			int num = amount / 10;
			int remainder = amount % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0) {
				this.chain.dispense(remainder);
			}
		} else {
			this.chain.dispense(amount);
		}
	}
}
