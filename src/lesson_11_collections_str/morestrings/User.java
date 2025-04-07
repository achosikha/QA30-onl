package lesson_11_collections_str.morestrings;

public class User {
    // FileInputStream
    // Прочитать строчки и вложить их в переменные
    private final String name;
    private final String surname;

    // String int;
    private final int age;
    // String mobileNumber
    private final long mobileNumber;

    public User(String name, String surname, int age, long mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }
}