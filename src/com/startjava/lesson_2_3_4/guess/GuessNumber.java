package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player pl1;
    private final Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println(secretNum);

        while (true) {
            System.out.println(pl1.getName() + ", введите число: ");
            pl1.setNumber(scanner.nextInt());
            if (compareNumbers(pl1, secretNum)) {
                break;
            }
            System.out.println(pl2.getName() + ",введите число: ");
            pl2.setNumber(scanner.nextInt());
            if (compareNumbers(pl2, secretNum)) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player, int secretNum) {
        if (player.getNumber() == secretNum) {
            System.out.println("Поздравляем!!! Победил игрок " + player.getName() +
                    ". \nЭто было число  - " + secretNum);
            return true;
        }
        System.out.println("Игрок " + player.getName() + " не угадал");
        System.out.println("Подсказка : ");
        if (player.getNumber() < secretNum) {
            System.out.println("число " + player.getNumber() +
                    " меньше того, что загадал компьютер");
        }
        if (player.getNumber() > secretNum) {
            System.out.println("число " + player.getNumber() +
                    " больше того, что загадал компьютер");
        }
        return false;
    }
}
