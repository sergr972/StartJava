package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Калькулятор запущен.");
                System.out.println("Введите математическое выражение в формате:");
                System.out.println("число действие число. Пробелы обязательны: ");
                String input = scanner.nextLine();
                System.out.println("Результат операции: " + Calculator.calculate(input));
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
            while (!"no".equals(answer)) ;
            System.out.println("Работа завершена!");
        }
    }