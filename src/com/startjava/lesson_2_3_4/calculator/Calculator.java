package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.floorDiv;

public class Calculator {

    private String input;
    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public void setInput(String input) {
        this.input = input;
    }

    public void readline() {
        String[] parseLine = input.split(" ", 3);
        firstNumber = Integer.parseInt(parseLine[0]);
        mathOperation = parseLine[1].charAt(0);
        secondNumber = Integer.parseInt(parseLine[2]);
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