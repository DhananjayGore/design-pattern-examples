package in.dhananjaygore.patterns.structural.decorator;

public class PassengerCar extends Decorator{

	public PassengerCar(Car car) {
		super(car);
	}

	public void design() {
		super.design();
		System.out.println("Passenger Car Design");
	}
}
