package in.dhananjaygore.patterns.creational.abstract_factory;

public class CatFactory implements BaseFactory {
	
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}