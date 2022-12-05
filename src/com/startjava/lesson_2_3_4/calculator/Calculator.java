package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] string;
    private int num1;
    private char mathOperation;
    private int num2;

    public void setString(String[] string) {
        this.string = string;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calculate(String input) {
        setString(input.split(" ", 3));
        setNum1(Integer.parseInt(string[0]));
        setNum2(Integer.parseInt(string[2]));
        setMathOperation(string[1].charAt(0));

        return switch (mathOperation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalStateException("Unexpected value: " + mathOperation);
        };
    }
}