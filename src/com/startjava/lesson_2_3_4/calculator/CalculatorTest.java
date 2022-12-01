package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            Calculator calc = new Calculator();
            System.out.println("Калькулятор запущен.");
            System.out.println("Введите математическое выражение");
            System.out.println("в формате 2 ^ 10, пробелы обязательны");
//            String str = scanner.nextLine();
            String str = "2 ^ 3";
            String[] strings = str.split(" ", 3);
            int firstNumber = Integer.parseInt(strings[0]);
            calc.setFirstNumber(firstNumber);
            char mathOperation = strings[1].charAt(0);
            calc.setMathOperation(mathOperation);
            int secondNumber = Integer.parseInt(strings[2]);
            calc.setSecondtNumber(secondNumber);

            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                userAnswer = scanner.next();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        }
        System.out.println("Работа завершена!");
    }
}