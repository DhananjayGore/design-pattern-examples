package in.dhananjaygore.patterns.creational.abstract_factory;

public class AbstractFactoryMainClass {

	public static void main(String[] args) {
        Animal animal = AbstractFactory.getAnimal(new DogFactory());
        System.out.println(animal.sound());
    }
}
