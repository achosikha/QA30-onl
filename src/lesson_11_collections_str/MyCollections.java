package lesson_11_collections_str;

import java.util.Arrays;

public class MyCollections {
    public static void main(String[] args) {
        // The most important topics in Java
        // OOP
        // STRING
        // Collections

        // Делается с использованием методов String + regular expressions, регулярные выражения
        // Регулярные выражения это короткие формулы, которые мы передаем для проверки данных в строчке
        // Обработать строчку и проверить является ли она легитимной для использования в роли электронного адреса

        // Только для продвинутых
        // Generics - обобщения
        // Потоки
        makeCalculatorInterface();
    }

    public static void makeCalculatorInterface(){
        // Во всех программах, данные зачастую идут в строчках
        // И выдавать значения тоже нужно в строчках
        StringBuilder expression = new StringBuilder("0");
        System.out.println(expression);

        // is it empty?
        if (expression.isEmpty()){
            expression.append("2");
        } else if (expression.length() == 1){
            if (expression.equals("0")){
                expression.replace(0, 0,  "2");
            }
        }
    }

    public static void getMoreStrings(){
        // Строчка: fsikhaR@mail.ru1
        // Обычное выражение из калькулятора: 78+36×8÷2+12 - вывести результат исходя из правил математики
        // 78+((36×8)÷2)+12
        String expression = "124+39*45-1/5";
        StringBuilder expressionBuilder = new StringBuilder(expression);
        String[] splitExpression = expression.split("[+/\\-*]");

        String expressionDivision = "34/4";
        String[] splitExpressionDivision = expressionDivision.split("/");

        // BigDecimal
        // BigInteger
        double valueL = Double.parseDouble(splitExpressionDivision[0]);
        double valueR = Double.parseDouble(splitExpressionDivision[1]);

        System.out.println((valueL/valueR));

        String sum = String.valueOf(
                Double.parseDouble(splitExpressionDivision[0])/Double.parseDouble(splitExpressionDivision[1])
        );

        System.out.println(sum);

        System.out.println("We have turned expression into array of String, calculated and returned String again: " +
                Double.parseDouble(splitExpressionDivision[0])/Double.parseDouble(splitExpressionDivision[1]));
        // Задаться вопросом, а как теперь вычислить эти данные?

        System.out.println(Arrays.toString(splitExpression));
    }
}
