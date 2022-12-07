package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        int result;
        do {
            if ("yes".equals(answer)) {
                System.out.println("Калькулятор запущен.");
                do {
                    System.out.println("\nВведите математическое выражение в формате:");
                    System.out.println("число действие число. Пробелы обязательны!");
                    System.out.println("Числа должны быть целыми и положительными!");
                    String input = scanner.nextLine();
                    result = Calculator.calculate(input);
                } while (result == -1);
                    System.out.println("Результат операции: " + result);
            }
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
            while (!"no".equals(answer)) ;
            System.out.println("Работа завершена!");
        }
    }