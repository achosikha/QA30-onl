package lesson_12_collections_2.subclasses;

public abstract class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String position;
    private final long mobilePhone;

    public Person(String name, String surname, int age, String position, long mobilePhone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Person: \n" +
                "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Age: " + this.age + "\n" +
                "Position: " + this.position + "\n" +
                "Mobile phone: " + this.mobilePhone;
    }
}
