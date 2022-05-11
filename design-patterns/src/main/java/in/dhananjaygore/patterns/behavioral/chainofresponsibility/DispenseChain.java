package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(int amount);
}
