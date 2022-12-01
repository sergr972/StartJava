package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.floorDiv;

public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondtNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondtNumber(int secondtNumber) {
        this.secondtNumber = secondtNumber;
    }

    public void calculate() {
        switch (mathOperation) {
            case '+':
                System.out.println(firstNumber + secondtNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondtNumber);
                break;
            case '*':
                System.out.println(Math.multiplyExact(firstNumber, secondtNumber));
                break;
            case '/':
                System.out.println(floorDiv(firstNumber, secondtNumber));
                break;
            case '%':
                System.out.println(firstNumber % secondtNumber);
                break;
            case '^':
                System.out.println((int) Math.pow(firstNumber, secondtNumber));
                break;
            default:
                System.out.println("Ощибка!!!");
        }
    }
}