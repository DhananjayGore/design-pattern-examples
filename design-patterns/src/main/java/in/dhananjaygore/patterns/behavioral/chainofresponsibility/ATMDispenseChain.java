package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public class ATMDispenseChain {
	public DispenseChain c1;

	public ATMDispenseChain() {

		DispenseChain c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		this.c1 = c1;
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
}
