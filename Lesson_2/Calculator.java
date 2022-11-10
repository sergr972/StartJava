package Lesson_2;

public class Calculator {

    private int a;
    private int b;
    private char sign;

//    public Calculator() {
//        this.a = 0;
//        this.b = 0;
//        this.sign = ' ';
//    }


//    public Calculator() {
//
//        this.a = a;
//        this.b = b;
//        this.sign = sign;
//    }

    public static int calc(int a, int b, char sign){
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
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(a, b, CalculatorTest.getSign());
        }
        return result;
    }
}