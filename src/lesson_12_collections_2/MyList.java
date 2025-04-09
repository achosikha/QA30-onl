package lesson_12_collections_2;

import lesson_12_collections_2.subclasses.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        // Если вам нужно в коллекции сохранить какой-то обобщенный объект
        // Можно супер класс Object, но на самом деле используются т.н. ОБОБЩЕНИЯ (GENERICS)
        // Или хорошо прописанный класс с соответствующим функционаломЕ
        savePerson();
    }

    public static void savePerson() {
        // List
        // Список - расширяемый список (массив)
        // Связанный список - элементы которого можно сдвигать без потери производительности

        /*
                staff.add(new Person("Archil", "Sikharulidze",
                36, "Java Developer", 844049440L));
                staff.add(new Person("Kate", "Volodyna",
                20, "Java QA", 3214324324L));
         */

        // NUMBER -> Byte, Short, Integer, Long, Float, Double

        // Person <=
        ArrayList<Person> staff = new ArrayList<>();

        staff.add(new BlueColorWorker("Archil", "Sikharulidze",
                36, "Java Developer", 844049440L));
        staff.add(new WhiteColorWorker("Kate", "Volodyna",
                20, "Java QA", 3214324324L));
        staff.add(new OutsourcingMember("Polina", "Gagarina", 19,
                "Java QA Outsource", 3955028303L));

        for (Person staffMember : staff) {
            System.out.println(staffMember);
            System.out.println("*******************************");
        }
    }

    public static void storeAnimals() {
        // Mammal<=
        LinkedList<Mammal> animalsZoo = new LinkedList<>();
        animalsZoo.add(new Monkey("Johnny", "Monkey"));

        for (Mammal animal : animalsZoo) {
            System.out.println(animal);
        }
    }
}
