package com.startjava.lesson_2_3_4.guess;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int index;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumber(int number) {
        numbers[getIndex()] = number;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

