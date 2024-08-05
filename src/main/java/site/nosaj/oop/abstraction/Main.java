package site.nosaj.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Lion lion = new Lion();

        dog.setAnimalName("Dog");
        dog.setAnimalWeight("22");
        lion.setAnimalName("Lion");
        lion.setAnimalWeight("108");

        dog.animalInfo();
        lion.animalInfo();
    }
}
