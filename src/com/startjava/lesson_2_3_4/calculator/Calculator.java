package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String input) {
        String[] mathExpression = input.split(" ", 3);
        char mathOperation = mathExpression[1].charAt(0);
        try {
            int num1 = Integer.parseInt(mathExpression[0]);
            int num2 = Integer.parseInt(mathExpression[2]);

            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Ошибка! Числа должны быть положительными!");
                return -1;
            }
            return switch (mathOperation) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> Math.floorDiv(num1, num2);
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default -> throw new IllegalArgumentException("Неверный знак операции");
            };
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Числа должны быть целыми!");
            return -1;
        }
    }
}