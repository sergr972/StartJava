package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.floorDiv;

public class Calculator {

    int result;
    private String input;
    private String[] strings;
    private int num1;
    private char mathOperation;
    private int num2;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
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

    public void readline() {
        setStrings(getInput().split(" ", 3));
        setNum1(Integer.parseInt(strings[0]));
        setMathOperation(strings[1].charAt(0));
        setNum2(Integer.parseInt(strings[2]));
    }

    public int calculate() {
        readline();
        switch (mathOperation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = Math.multiplyExact(num1, num2);
            case '/' -> result = floorDiv(num1, num2);
            case '%' -> result = num1 % num2;
            case '^' -> result = (int) Math.pow(num1, num2);
        }
        return result;
    }
}