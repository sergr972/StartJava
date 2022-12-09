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

    private final int ATTEMPTS_LIMIT = 10;

    public void start() {
        int secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println(secretNumber);

        Arrays.fill(pl1.getNumbers(), 0, pl1.getAttempt() + 1, 0);
        Arrays.fill(pl2.getNumbers(), 0, pl2.getAttempt() + 1, 0);

        for (int i = 0; i < ATTEMPTS_LIMIT; i++) {
            inputNumber(pl1, i);
            if (compareNumbers(pl1, i, secretNumber)) {
                break;
            }
            inputNumber(pl2, i);
            if (compareNumbers(pl2, i, secretNumber)) {
                break;
            }
        }
        System.out.print("\nЧисла игрока " + pl1.getName() + " ");
        printNumbers(pl1.getNumbers());
        System.out.print("\nЧисла игрока " + pl2.getName() + " ");
        printNumbers(pl2.getNumbers());
    }

    private void inputNumber(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + player.getName() + ", введите число: ");
        player.setAttempt(index);
        player.addNumber(scanner.nextInt());

        if (index == ATTEMPTS_LIMIT - 1) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
    }

    private boolean compareNumbers(Player player, int index, int secretNumber   ) {
        if (player.getNumbers()[index] == secretNumber) {
            System.out.println("\nПоздравляем!!! Игрок " + player.getName() +
                    " угадал число " + secretNumber + " с " + " попытки " + (index + 1));
            return true;
        }
        System.out.println("\nИгрок " + player.getName() + " не угадал");
        System.out.print("Подсказка: число " + player.getNumbers()[index]);
        System.out.print(player.getNumbers()[index] < secretNumber ? " меньше " : " больше ");
        System.out.println("того, что загадал компьютер");
        return false;
    }

    private static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.printf("%3d %s", number, " ");
        }
    }
}