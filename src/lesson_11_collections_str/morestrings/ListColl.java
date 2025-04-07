package lesson_11_collections_str.morestrings;

import java.util.ArrayList;
import java.util.List;

public class ListColl {
    public static void main(String[] args) {
        // Collections
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