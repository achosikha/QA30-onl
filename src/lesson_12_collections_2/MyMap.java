package lesson_12_collections_2;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        // MAP - это уникальное дерево
        // У каждого элемента КАРТЫ есть КЛЮЧ и прикрепленный к нему ОТВЕТ/ЗНАЧЕНИЕ
        // KEY - VALUE
        // KEY должны быть уникальными
        // А вот VALUE необязательно
        getMap();
    }

    public static void getMap(){
        Map<String, String> vocabulary = new TreeMap<>();
        vocabulary.put("House", "Дом");
        vocabulary.put("Horse", "Дом");
        vocabulary.put("Zebra", "Зебра");
        vocabulary.put("Animal", "Животное");
        vocabulary.put("Dog", "Собака");

        System.out.println(vocabulary);
        System.out.println("Under the keyword 'ZEBRA': " + vocabulary.get("Zebra"));

        // HOW TO USE - ITERATOR
        // HOW TO GET ALL KEYS
        // HOW TO GET ALL VALUES

        System.out.println("Есть ли у вас в словаре такое значение как КОШКА: " + vocabulary.containsValue("Кошка"));
    }
}
