package in.dhananjaygore.patterns.structural.decorator;

public class MainApp {

	public static void main(String[] args) {
		
		BasicCar basicCar = new BasicCar();
		Car car = new PassengerCar(basicCar);
		car.design();
	}

}
