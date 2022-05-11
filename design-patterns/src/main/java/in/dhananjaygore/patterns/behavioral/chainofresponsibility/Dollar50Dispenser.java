package in.dhananjaygore.patterns.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 50) {
            int num = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.chain.dispense(remainder);
            }
        } else {
            this.chain.dispense(amount);
        }
    }
}
