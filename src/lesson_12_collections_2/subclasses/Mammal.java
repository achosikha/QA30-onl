package lesson_12_collections_2.subclasses;

public abstract class Mammal extends Animal{
    public Mammal(String name, String animalType) {
        super(name, animalType);
    }

    protected abstract void getMammalNotification();
}
