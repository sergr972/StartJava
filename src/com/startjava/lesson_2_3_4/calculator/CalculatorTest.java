package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        do {
            Calculator calculator = new Calculator();
            System.out.println("Введите математическое выражение в формате:");
            String str = scanner.next();
            String[] strings = str.split(" ", 3);
            int num1 = Integer.parseInt(strings[0]);
            int num2 = Integer.parseInt(strings[2]);
            char operation = strings.charAt();

            int result = calculator.calculate(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                userAnswer = scanner.next();
            } while (!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while (userAnswer.equals("yes"));
    }
}