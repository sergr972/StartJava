package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        do {
            Calculator calculator = new Calculator();
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            int result = calculator.calculate(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                userAnswer = scanner.next();
            } while (!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while (userAnswer.equals("yes"));
    }
}