package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.floorDiv;

public class Calculator {

    int result;
    private String input;
    private String[] string;
    private int num1;
    private char mathOperation;
    private int num2;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

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

    public int calculate() {
        readline();
        switch (mathOperation) {
            case '+':
                result = num1 + num2;
            break;
            case '-':
                result = num1 - num2;
            break;
            case '*':
                result = Math.multiplyExact(num1, num2);
            break;
            case '/':
                result = floorDiv(num1, num2);
            break;
            case '%':
                result = num1 % num2;
            break;
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                break;
        }
        return result;
    }

    public void readline() {
        setString(getInput().split(" ", 3));
        setNum1(Integer.parseInt(string[0]));
        setMathOperation(string[1].charAt(0));
        setNum2(Integer.parseInt(string[2]));
    }
}