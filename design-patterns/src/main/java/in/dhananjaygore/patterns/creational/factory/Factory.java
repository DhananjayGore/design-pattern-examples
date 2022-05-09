package in.dhananjaygore.patterns.creational.factory;

public class Factory {
	public static Animal getAnimal(AnimalType type) {
        switch (type) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            case DUCK:
                return new Duck();
            default:
                return null;
        }
    }
	
}
