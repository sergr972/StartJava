package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private final Player pl1;
    private final Player pl2;

    public GuessNumber(Player pl1, Player pl2) {

        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    static final int ARR_LEN = 10;

    public void start() {
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println(secretNum);

        Arrays.fill(pl1.getNumbers(), 0, pl1.getIndex() + 1, 0);
        Arrays.fill(pl2.getNumbers(), 0, pl2.getIndex() + 1, 0);

        for (int i = 0; i < ARR_LEN; i++) {
            play(pl1, i);
            if (compareNumbers(pl1, i, secretNum)) {
                break;
            }
            play(pl2, i);
            if (compareNumbers(pl2, i, secretNum)) {
                break;
            }
        }
        System.out.print("\nЧисла игрока " + pl1.getName() + " ");
        printIntArray(Arrays.copyOf(pl1.getNumbers(), pl1.getIndex() + 1));
        System.out.print("\nЧисла игрока " + pl2.getName() + " ");
        printIntArray(Arrays.copyOf(pl2.getNumbers(), pl2.getIndex() + 1));
    }

    private void play(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + player.getName() + ", введите число: ");
        player.setIndex(index);
        player.setNumber(scanner.nextInt());

        if (index == ARR_LEN - 1) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
    }

    private boolean compareNumbers(Player player, int index, int secretNum) {
        if (player.getNumbers()[index] == secretNum) {
            System.out.println("\nПоздравляем!!! Игрок " + player.getName() +
                    " угадал число " + secretNum + " с " + " попытки " + (index + 1));
            return true;
        }
        System.out.println("\nИгрок " + player.getName() + " не угадал");
        System.out.print("Подсказка: число " + player.getNumbers()[index]);
        System.out.print(player.getNumbers()[index] < secretNum ? " меньше " : " больше ");
        System.out.println("того, что загадал компьютер");
        return false;
    }

    private static void printIntArray(int[] nums) {
        for (int num : nums) {
            System.out.printf("%3d %s", num, " ");
        }
    }
}