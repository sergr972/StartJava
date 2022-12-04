package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.floorDiv;

public class Calculator {

    private String[] input;
    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public void setInput(String[] input) {
        this.input = input;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void readline() {
        setFirstNumber(Integer.parseInt(input[0]));
        setMathOperation(input[1].charAt(0));
        setSecondNumber(Integer.parseInt(input[2]));
    }

    public void calculate() {
        switch (mathOperation) {
            case '+' -> System.out.println(firstNumber + secondNumber);
            case '-' -> System.out.println(firstNumber - secondNumber);
            case '*' -> System.out.println(Math.multiplyExact(firstNumber, secondNumber));
            case '/' -> System.out.println(floorDiv(firstNumber, secondNumber));
            case '%' -> System.out.println(firstNumber % secondNumber);
            case '^' -> System.out.println((int) Math.pow(firstNumber, secondNumber));
            default -> System.out.println("Ощибка!!!");
        }
    }
}