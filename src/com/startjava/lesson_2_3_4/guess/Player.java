package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private static final int ATTEMPTS_LIMIT = 10;
    private final int[] numbers = new int[ATTEMPTS_LIMIT];
    private int attempt;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int[] getNumbersAttempt() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addNumber(int number) {
        numbers[attempt - 1] = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}

