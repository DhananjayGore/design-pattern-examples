package in.dhananjaygore.patterns.creational.abstract_factory;

public class DogFactory implements BaseFactory {

	@Override
    public Animal createAnimal() {
        return new Dog();
    }

}
