package in.dhananjaygore.patterns.creational.abstract_factory;

public class DuckFactory implements BaseFactory {

	@Override
    public Animal createAnimal() {
        return new Duck();
    }

}
