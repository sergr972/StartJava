package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        System.out.println("Калькулятор запущен.");
        do {
            if ("yes".equals(answer)) {
                try {
                    System.out.println("\nВведите математическое выражение в формате:");
                    System.out.println("число действие число. Пробелы обязательны!");
                    System.out.println("Числа должны быть целыми и положительными!");
                    String input = scanner.nextLine();
                    System.out.println("Результат операции: " + Calculator.calculate(input));
                    System.out.println("Хотите продолжить вычисления? [yes/no]");
                    answer = scanner.nextLine();
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!"no".equals(answer));
        System.out.println("Работа завершена!");
    }
}