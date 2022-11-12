package Lesson_2;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public int calculate(int a, int b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
        int result = 0;
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
        }
        return result;
    }
}