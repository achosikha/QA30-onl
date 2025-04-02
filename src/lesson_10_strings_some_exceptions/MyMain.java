package lesson_10_strings_some_exceptions;
import lesson_10_strings_some_exceptions.except.PasswordVerification;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        try{
            System.out.print("Please enter a password to verify your username: ");
            String password = new Scanner(System.in).nextLine();

            callException(password);
        }catch (PasswordVerification e){
            System.out.println(e.getMessage());
        }
    }

    public static void callException(String password) throws PasswordVerification{
        // throws, throw
        // throws - пробрасывает исключения на уровне метода
        // throw на уровне блока кода создает новое анонимное исключение

        if (new PasswordVerification().getPassword().equals(password)){
            throw new PasswordVerification("Your PASSWORD is CORRECT!");
        } else {
            throw new PasswordVerification("Your PASSWORD is INCORRECT!");
        }
    }
}