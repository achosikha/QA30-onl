package homework_4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        // Code
        checkNumberInArray();
    }

    public static void checkNumberInArray(){
        // Создать одномерный массив
        // Заполнить его определенными числами
        // Потом использовать класс Сканнер и попросить у пользователя ввести любое число
        // Проверить есть ли это число в массиве и уже вывести массив без этого числа
        // Создать новый массив (желательно)

        int[] initialValues = new int[6];

        for (int index = 0; index < initialValues.length; index++){
            System.out.print("You must enter " + initialValues.length + " integer numbers. " +
                    "initialValues[" + (index + 1) + "]: ");
            initialValues[index] = input().nextInt();
        }

        // КАК МОЖНО ОТСОРТИРОВАТЬ МАССИВ
        // Вначале отсортировать массив по возрастанию, -9, 0, 5, 10
        // Использовать вложенный в класс Arrays бинарный пойск
        // Бинарный пойск работает лишь в отсортированных массивах

        System.out.print("Please, enter an integer number and we will check whether such value exists in the array: ");
        int value = input().nextInt();
        int counter = 0;

        for (int initialValue : initialValues) {
            if (initialValue == value) {
                // Подсчитывать количество совпадений в массиве
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("We couldn't find any matches in the array. There is no need for changes.");
            showIntArray(initialValues);
        } else {
            if (counter < initialValues.length){
                int[] newArray = new int[initialValues.length - counter];

                for (int index = 0, newIndex = 0; index < initialValues.length; index++){
                    if (initialValues[index] != value){
                        newArray[newIndex] = initialValues[index];
                        newIndex++;
                    }
                }

                showIntArray(newArray);
            } else {
                System.out.println("You have entered a value that matches all elements of the array.");
                System.out.println("So far, there are no elements anymore.");
            }
        }
    }

    public static void showIntArray(int[] initialValues){
        for (int index = 0; index < initialValues.length; index++){
            System.out.println("initialValues[" + index +"]: " + initialValues[index]);
        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
}
