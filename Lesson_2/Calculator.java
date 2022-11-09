package Lesson_2;

public class Calculator {

    public static int calc(int num1, int num2, char operation){
        int result = 1;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, CalculatorTest.getOperation());
        }
        return result;
    }
}