package lesson_10_strings_some_exceptions.except;

// Password verification
// Class Verification extends Exception
// Добавить метод проверки пароля, если пароль неверен - ошибка
public class PasswordVerification extends Exception{
    private final String password = "Rt78_!78";

    public PasswordVerification(){}

    public PasswordVerification(String msg){
        super(msg); // позволяет просто выводит случайные сообщения, которые нам нужно
    }

    public String getPassword() {
        return password;
    }
}