package in.dhananjaygore.patterns.creational.abstract_factory;

public class AbstractFactory {

	public static Animal getAnimal(BaseFactory bf) {
        return bf.createAnimal();
    }
}
