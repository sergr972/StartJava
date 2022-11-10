package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        class ReadClass {
            public int readNextInt() {
                int i = 0;
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                } else {
                    System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                }
                return i;
            }
        }

        ReadClass readClass = new ReadClass();
        int num1;
        int num2;
        System.out.println("Введите первое число: ");
        num1 = readClass.readNextInt();
        System.out.println("Введите второе число: ");
        num2 = readClass.readNextInt();

        int result = Calculator.calc(num1, num2, getSign());
        System.out.println("Результат операции: " + result);
//        System.out.println("Хотите продолжить вычисления? [yes/no]");
//        String answers = scanner.next();
//        if (answers.equals("yes")) {
//
//        }
//        if (answers.equals("No")) ;

    }
    public static char getSign() {

        System.out.println("Введите знак математической операции:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getSign();
        }
        return operation;
    }
}