package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int attempt;
    private final String name;
    private static final int ATTEMPTS_LIMIT = 10;
    private final int[] numbers = new int[ATTEMPTS_LIMIT];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addNumber(int number) {
        try {
            if (number < 1 || number > 100) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Ошибка! Нужно вводить число в полуинтервале (0, 100]");
        }
        numbers[attempt - 1] = number;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}
