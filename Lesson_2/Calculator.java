package Lesson_2;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public int ICalculator(int a, int b, char sign) {

        this.a = a;
        this.b = b;
        this.sign = sign;
        int result = 1;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
        }
        return result;
    }
}