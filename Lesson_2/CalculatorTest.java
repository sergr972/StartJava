package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String reply = "yes";
        while(reply.equals("yes")) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = Calculator.calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            reply = "";
            while(!reply.equals("yes") && !reply.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                reply = scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}