package com.startjava.lesson_1.total;

public class Calculator {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result = 1;
        // знаки операций +, -, *, /, ^, %
        char sign = '^';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
