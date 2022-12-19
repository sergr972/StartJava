package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private int attempt;
    private int countWin;
    private final String name;
    private static final int ATTEMPTS_LIMIT = 10;
    private final int[] numbers = new int[ATTEMPTS_LIMIT];

    public Player(String name) {
        this.name = name;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getCountWin() {
        return countWin;
    }

    public void addCountWin(int countWin) {
        this.countWin = countWin;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addNumber(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Ошибка! Нужно вводить число в полуинтервале (0, 100]");
        }
        numbers[attempt] = number;
        attempt++;
    }
}
