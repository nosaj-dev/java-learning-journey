package site.nosaj.oop.abstraction;

abstract class Animal {
    private String animalName;
    private String animalWeight;

    abstract String makeSound();

    public void animalInfo(){
        System.out.println("Animal name: " + this.animalName + "\n" +
                "Animal weight: " + this.animalWeight + "\n" +
                "Makes this sound: " + makeSound());
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(String animalWeight) {
        this.animalWeight = animalWeight;
    }
}
