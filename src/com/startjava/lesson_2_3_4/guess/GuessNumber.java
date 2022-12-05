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

        for (int i = 0; i < 10; i++) {
            System.out.print(pl1.getName() + ", введите число: ");
            pl1.setIndex(i);
            pl1.setNumber(scanner.nextInt());
            if (compareNumbers(pl1, i, secretNum)) {
                break;
            }
            System.out.print(pl2.getName() + ",введите число: ");
            pl2.setIndex(i);
            pl2.setNumber(scanner.nextInt());
            if (compareNumbers(pl2, i, secretNum)) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player, int index, int secretNum) {

//        if (player.getNumbers(index) == secretNum) {
//            System.out.println("Поздравляем!!! Игрок " + player.getName() +
//                    "угадал число " + secretNum + " с " + " попытки");
//            return true;
//        }
//        System.out.println("Игрок " + player.getName() + " не угадал");
//        System.out.println("Подсказка : ");
//        if (player.getNumbers() < secretNum) {
//            System.out.println("число " + player.getNumbers() +
//                    " меньше того, что загадал компьютер");
//        }
//        if (player.getNumbers() > secretNum) {
//            System.out.println("число " + player.getNumbers() +
//                    " больше того, что загадал компьютер");
//        }
        return false;
    }
}
