package lesson_10_strings_some_exceptions.except;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyExceptionsA{
    public static void main(String[] args) {
        // Подгрузить базу данных

        // try-catch
        // try-catch-finally
        // try-with-resources

        try{
            int[] values = new int[]{1, 9, 10, 11};

            for (int index = 0; index <= values.length; index++){
                System.out.println(values[index]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            // Под конец выполнения конструктора
            // надо что-то зачистить, финализировать
        }
    }

    public static void readDocument(){
        File input = new File("src/lesson_10_strings_some_exceptions/except/data.txt");

        // try-with-resources в том, чтобы открыть ресурс и автоматический его закрыть
        try(FileInputStream readDocument = new FileInputStream(input)){
            int letter;

            // Documents, the end of the file -1, EOF
            while((letter = readDocument.read()) != -1){
                System.out.print((char) letter);
            }
        }catch (FileNotFoundException e){
            System.out.println("File was not found: " + e.getMessage());
        }catch (IOException e){
            System.out.println("This is a GENERAL IOException message: " + e.getMessage());
        }
    }

    public static void tryCatch(){
        try{
            System.out.println(10/0);
        }catch (Exception e){
            // LOG FILES - save data on mistakes
            System.out.println(e.getMessage());
        }
        System.out.println("Mistake is here.");

        int[] numbers = new int []{1, 9, 10, -1, 5};

        try {
            for (int index = 0; index <= numbers.length; index++){
                System.out.println(numbers[index]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("SAVE THE MESSAGE TO THE LOG: " + e.getMessage());;
        } finally {
            // Раньше выполнял функцию закрытия всех ресурсов и каких=то окончательных действий
        }
        System.out.println("Program continues working despite array being out of index!");
    }
}
