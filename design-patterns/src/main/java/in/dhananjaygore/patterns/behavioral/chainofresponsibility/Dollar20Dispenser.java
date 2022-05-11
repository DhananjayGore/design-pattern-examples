package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 20) {
			int num = amount / 20;
			int remainder = amount % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			if (remainder != 0) {
				this.chain.dispense(remainder);
			}
		} else {
			this.chain.dispense(amount);
		}
	}
}
