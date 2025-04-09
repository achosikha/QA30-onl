package lesson_12_collections_2.collset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetCollection {
    public static void main(String[] args) {
        // Interface SET
        // 1. Unique values, если вы попытаетесь вставить в любую реализацию СЕТ уже существующее значение, он
        // просто ничего не сделает, а метод добавления элемента вернет логическое FALSE, т.н.
        // попытка вставки нового элемента не удалась
        // HashSet
        // LinkedHashSet
        // TreeSet
        getTreeSet();
    }

    // МОЖНО ЗАДАТЬСЯ ВАЖНЫМ ВОПРОСОМ: ЕСТЬ ЛИ У КОЛЛЕКЦИИ СИНХРОНИЗАЦИЯ? КАК КОЛЛЕКЦИЯ РАБОТАЕТ С ПОТОКАМИ
    public static void getHashSetCollection(){
        // Для каждого значения высчитывает формулой специальный уникальный ХЭШ ЗНАЧЕНИЕ типа int
        // И значения хранятся в этой коллекции уже не тому, как мы вставили, а какой ХЭШ КОД был
        // назначен каждому элементы

        // 1. Тут можно хранить только уникальные значения
        // 2. Коллекция не отсортирована
        // 3. Данные хранятся по специальным ХЭШ КОДАМ
        // 4. Это значит, что нарушается порядок вставки элементов
        // 5. Порядок зависит от ХЭШ КОДА
        // 6. Поскольку порядок вставки данных нарушается - нет возможности получить данные по индексу
        // 7. Данные получаются по ХЭШАМ
        Set<Integer> hashSetIntegerValues = new HashSet<>();
        hashSetIntegerValues.add(100); // специальной формулой высчитал ХЭШ КОД
        hashSetIntegerValues.add(-1);
        hashSetIntegerValues.add(8);
        hashSetIntegerValues.add(0);
        hashSetIntegerValues.add(-2);
        hashSetIntegerValues.add(9);
        hashSetIntegerValues.add(32);
        hashSetIntegerValues.add(11);

        // ПОТОМ, на основе всех ХЭШ КОДОВ расположил

        Set<String> hashSetNames = new HashSet<>();
        hashSetNames.add("Archil"); // method add() - returns boolean values TRUE or FALSE
        hashSetNames.add("Katya");
        hashSetNames.add("Andrey");
        hashSetNames.add("Zhenya");

        System.out.println(hashSetIntegerValues);
        System.out.println(hashSetNames);

        System.out.println("*********************************");
        showHashSetInteger(hashSetIntegerValues);
        System.out.println("********************************************");
        showHashSetString(hashSetNames);

        System.out.println(hashSetIntegerValues.add(100));
        System.out.println(hashSetNames.add("Archil"));
        System.out.println("*********************************");
        showHashSetInteger(hashSetIntegerValues);
        System.out.println("********************************************");
        showHashSetString(hashSetNames);
    }

    public static void getLinkedHashSet(){
        // LinkedHashSet
        // 1. Уникальность
        // 2. Порядок вставки сохраняется
        // 3. Но все равно там ХЭШ КОДУ
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Archil"); // method add() - returns boolean values TRUE or FALSE
        linkedHashSet.add("Katya");
        linkedHashSet.add("Andrey");
        linkedHashSet.add("Volodya");
        linkedHashSet.add("Ivan");
        linkedHashSet.add("Nadezhda");
        linkedHashSet.add("Vova");
        linkedHashSet.add("Kiril");
        linkedHashSet.add("Ulyana");
        linkedHashSet.add("Polina");

        System.out.println(linkedHashSet);

        for (String names : linkedHashSet){
            System.out.println("Element: " + names + " with hash code: " + names.hashCode());
        }
    }

    public static void getTreeSet(){
        // Главное ОТСОРТИРОВАН
        Set<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Archil"); // method add() - returns boolean values TRUE or FALSE
        namesTreeSet.add("Katya");
        namesTreeSet.add("Andrey");
        namesTreeSet.add("Volodya");
        namesTreeSet.add("Ivan");
        namesTreeSet.add("Nadezhda");
        namesTreeSet.add("Vova");
        namesTreeSet.add("Kiril");
        namesTreeSet.add("Ulyana");
        namesTreeSet.add("Polina");

        System.out.println(namesTreeSet);

        for (String names : namesTreeSet){
            System.out.println("Element: " + names + " with hash code: " + names.hashCode());
        }

        Set<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(100); // специальной формулой высчитал ХЭШ КОД
        integerTreeSet.add(-1);
        integerTreeSet.add(8);
        integerTreeSet.add(0);
        integerTreeSet.add(-2);
        integerTreeSet.add(9);
        integerTreeSet.add(32);
        integerTreeSet.add(11);

        System.out.println(integerTreeSet);
        for (Integer names : integerTreeSet){
            System.out.println("Element: " + names + " with hash code: " + names.hashCode());
        }
    }

    public static void showHashSetString(Set<String> names){
        for (String element : names){
            System.out.println("Element: " + element + " with hash code: " + element.hashCode());
        }
    }

    public static void showHashSetInteger(Set<Integer> values){
        for (Integer element: values){
            System.out.println("Element: " + element + " with hash code: " + element.hashCode());
        }
    }
}
