import java.util.ArrayList;

public class MyMainHomeworkComments {
    public static void main(String[] args) {
        // C-style array declaration must be replaced by Java style
        int[] numbers = new int[]{1, 19, 0, -1};

        boolean isAEmployed = true;

        System.out.println("Are you employed? ");

        // isEmployed by default рассматривается как TRUE
        if (isAEmployed){
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

        // isEmployed == false
        if (!isAEmployed){
            System.out.println("NO!");
        }

        // Случайные числа создаются с помощью двух классы Math = Random
        // Random = decimals
        // Math.random() - double = 0.....
        // Math.random() - 1 till 10, 0.04 - 0.9999
        // Multiply * 10, Math.floor() эта библиотека делает возможность случайных чисел еще более случайным
        // округление даст большее количество случайных чисел
        // Math.round() - он даст меньше случайных чисел, поскольку округляет тупо

        int[] values = {19, -1, 2, 11, 5, 4};
        System.out.println("Please enter value and we will delete the number: ");
    }
}
