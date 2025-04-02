package lesson_10_strings_some_exceptions.moreoop;

// Class, it stores DATA
// Class, abstract class
public abstract class Human implements Functions{
    private final String humanSpecies;
    private final long age;

    public Human(String humanSpecies, long age) {
        this.humanSpecies = humanSpecies;
        this.age = age;
    }
}