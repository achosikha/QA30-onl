package lesson_12_collections_2.subclasses;

public abstract class Animal {
    private final String name;
    private final String animalType;

    public Animal(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal: \n" +
                "Name: " + this.name + "\n" +
                "Animal type: " + this.animalType;
    }
}
