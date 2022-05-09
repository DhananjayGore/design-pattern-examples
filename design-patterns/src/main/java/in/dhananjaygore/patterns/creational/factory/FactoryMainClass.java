package in.dhananjaygore.patterns.creational.factory;

public class FactoryMainClass {
    public static void main(String[] args) {
        Animal animal = Factory.getAnimal(AnimalType.CAT);
        System.out.println(animal.sound());
    }
}
