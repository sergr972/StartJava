package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                Calculator calc = new Calculator();
                System.out.println("Калькулятор запущен.");
                System.out.println("Введите математическое выражениев формате:");
                System.out.println("число действие число. Пробелы обязательны: ");
                String input = scanner.nextLine();
                calc.setInput(input);
                System.out.println("Результат операции: " + calc.calculate());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        System.out.println("Работа завершена!");
    }
}