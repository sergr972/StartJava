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
                System.out.println("Введите математическое выражениев формате 2 ^ 10.");
                System.out.print("Пробелы обязательны: ");
            String str = scanner.nextLine();
                String[] strings = str.split(" ", 3);
                int firstNumber = Integer.parseInt(strings[0]);
                calc.setFirstNumber(firstNumber);
                char mathOperation = strings[1].charAt(0);
                calc.setMathOperation(mathOperation);
                int secondNumber = Integer.parseInt(strings[2]);
                calc.setSecondtNumber(secondNumber);

                calc.calculate();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        System.out.println("Работа завершена!");
    }
}
