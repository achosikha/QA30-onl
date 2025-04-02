package lesson_10_strings_some_exceptions;

public class MainString {
    public static void main(String[] args) {
        // ЭТО КОНСТАНТА - FINAL VALUE
        String name = "Archil"; // это значение, которое нельзя поменять

        // Если вы поменяли значение переменной, оно на самом деле пересоздается уже с новым значением
        name = "Vasya";

        System.out.println(name.charAt(0));

        // charAt()
        // equals()
        // split()

        // StringBuilder()
        // StringBuffer()

        StringBuilder string = new StringBuilder("Archil Sikharulidze");
        System.out.println(string);
        string.append(" is a nice guy.");
        System.out.println(string);
        string.replace(0, 1, "R");
        System.out.println(string);
    }

    public static void explainStringPool(){
        // String without keyword NEW saves value in a STRING POOL
        // Каждая следующая строчка, которая создана без выделения памяти будет искать
        // Соответствие в ПУЛЕ, и если оно есть - просто будет указывать на это память
        // Так идет оптимизация занимаемой строчками места
        String value = "This is a general information.";
        String fullCreation = new String("Welcome to a NON-OPTIMIZED STRING");

        String sName = "Archil";
        String sNameS = "Archil";

        // new ломают оптимизацию строчек и целенаправленно, за пределами СТРИНГ ПУЛА
        // выделит отдельную память
        String sNameSN = new String("Archil");
        System.out.println("ADDRESS: " + (sName == sNameSN));


        // Сравнивание двух объектов через имена переменных
        // Это сравнивание двух ссылок
        System.out.println("IF ADDRESSES ARE EQUAL, VARIABLES POINT TO THE SAME MEMORY: " + (sName == sNameS));

        System.out.println(value);
        System.out.println(fullCreation);
    }

    public static void basicStrings(){
        // Это массив символов
        // Это массив из определенного количества символов типа char
        // То, что отличает ваш массив от Строчки - это специальный знак окончания - '\0'
        char[] nameArray = new char[]{'A', 'r', 'c', 'h', 'i', 'l', '\0'};

        String name = "Archil";

        // 5 5 value
        String composition = 5 + " " + 5 + " value";

        System.out.println(composition);

        // 15S105
        String compositionComplicated = 5 + 10 + "S" + 10 + 5;
        System.out.println(compositionComplicated);

        // 510S15
        String compositionComplicatedDouble = 5 + (10 + "S") + (10 + 5);
        System.out.println(compositionComplicatedDouble);

        String cannot = String.valueOf(5);
        String cannotDouble = 5 + "";
        System.out.println(cannot);
        System.out.println(cannotDouble);

        String surname = "Sikharulidze";
        String fullName = name + " " + surname;

        System.out.println(fullName);
    }
}
