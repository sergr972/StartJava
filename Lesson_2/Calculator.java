package Lesson_2;

public class Calculator {

    public int calculate(int a, int b, char sign) {
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