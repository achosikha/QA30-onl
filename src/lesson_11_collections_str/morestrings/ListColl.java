package lesson_11_collections_str.morestrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListColl {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 10};
        String[] values = new String[]{"Archil", "Vasya"};

        // numbers +1, +10, +100 ???
        // numbers IN THE MIDDLE 1

        // Словарь
        // Дом - House

        resizableLinkedList();
    }

    public static void resizableLinkedList(){
        // LinkedList - index, all the same methods
        // То как хранится сама структура
        // Каждый элемент связанного списка хранит адрес предыдущего и последующего элемента
        // Если такой есть
        List<Double> values = new LinkedList<>();
        values.add(45D);
        values.add(-1.3);
        values.add(76D);
        values.add(-9.1);

        readListNumber(values);
    }

    public static void readListNumber(List<Double> values){
        for(Number el : values){
            System.out.println(el);
        }
    }

    public static void resizableArrayList(){
        // List - это, по сути, возможность расширяться стандартный массив
        // ArrayList()
        // LinkedList()
        // Vector -> Stack - практически не используются

        // ArrayList() - просто массив длину которого можно менять
        // LinkedList() - этл связанный список, по сути, это тоже массив, но стиль его хранения отличается

        // Расширяемый массив
        List<String> names = new ArrayList<>();

        System.out.println(names);

        names.add("Archil");
        System.out.println(names);

        names.add("Valodya");
        names.add("Irina");
        names.add("Olga");
        System.out.println(names);

        getArrayList(names);

        // Collections - размер (size), а вместимость (capacity)
        // Если у нас в ArrayList добавлено 4 элемента, размер будет 4
        // Но вместимость (capacity) - это максимальное количество значений, которое было выделено для работы
        // Оно будет расширяться в зависимости от того, сколько пространства нужно
        // Т.е. если у вас ArrayList из 100 значений (размер), вместимость будет 100 + .... число
        names.add(1, "Natella");
        names.addFirst("Kristina");
        names.addLast("Irma");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);

        names.clear();
        System.out.println(names);

        // int - Integer
        // double - Double
        // char - Character
        // short - Short
        // float - Float
        // long - Long
        // ОТЕЦ ВСЕХ ЧИСЕЛ - Number
        // ОБЕРТКА ПРИМИТИВНОГО ТИПА
        // Чтобы пробросить в коллекцию примитивный тип boolean надо обернуть его в класс - Boolean
        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(-1);
        numbers.add(0);
        System.out.println(numbers);

        List<Number> anyNumberValue = new ArrayList<>(); // Byte, Short, Integer, Float, Double, Long
    }

    public static void getArrayList(List<String> names){
        // for-advanced loop
        for (String element : names){
            System.out.println(element);
        }

        /*
        // for classical loop
        for (int index = 0; index < names.size(); index++){
            System.out.println(names.get(index));
        } */
    }

    public static void getClassCollection(){
        // Separately class Collections
        Collections values;
    }

    public static void getExample(){
        // Class Animal
        // child Class Mammal
        // child class of Mammal of Animal - Monkey

        // Animal (method KL()) j1 = new Monkey() -> only METHOD KL()
        // Mammal j2 = new Monkey() - Mammal (method MamFL()) -> KL(), MamFL()
        // Monkey j3 = new Monkey() - KL(), MamFL() + все что есть у непосредственно класса Обезьяна

        // Когда работаем с коллекциями - важно помнить, что БАЗОВЫЙ ИНТЕРФЕЙС вам дает ФУНКЦИОНАЛ
        // А реализация указывает на то, КАК ВЫ БУДЕТЕ ХРАНИТЬ ДАННЫЕ, В СТРУКТУРЕ
        List<Integer> decimalValues = new ArrayList<>();
    }
}