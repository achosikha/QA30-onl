package lesson_12_collections_2.subclasses;

public class Monkey extends Mammal{
    public Monkey(String name, String animalType) {
        super(name, animalType);
    }

    @Override
    protected void getMammalNotification() {
        System.out.println("Monkey says: HURRAA!");
    }
}
