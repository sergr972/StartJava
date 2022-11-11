package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        String answers;
        do {
            Scanner scanner = new Scanner(System.in);

            Calculator calculator = new Calculator();

            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();

            int result = calculator.ICalculator(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answers = scanner.next();
            } while (!answers.equals("no") && !answers.equals("yes"));
        } while (answers.equals("yes"));
    }
}