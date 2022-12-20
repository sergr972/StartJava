package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] player;
    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(Player... players) {
        player = players;
        Random rand = new Random();
        for (int i = player.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Player tmp = player[index];
            player[index] = player[i];
            player[i] = tmp;
        }
    }

    public void start() {
        first:
        for (int i = 1; i <= ROUNDS_LIMIT; i++) {
            System.out.println("\n\nРаунд " + i);
            clear();
            int secretNumber = (int) (Math.random() * 100) + 1;
            System.out.println(secretNumber);
            for (int j = 0; j < ATTEMPTS_LIMIT; j++) {
                for (Player player : player) {
                    inputNumber(player);
                    if (compareNumbers(player, j + 1, secretNumber)) {
                        printNumbers(this.player);
                        continue first;
                    }
                }
            }
        }
        System.out.print("\n\nПо результатам 3-х раундов - ");
        if (player[0].getCountWin() == player[1].getCountWin() &&
                player[2].getCountWin() == player[1].getCountWin()) {
            System.out.println("ничья");
        } else {
            int max = player[0].getCountWin();
            String win = player[0].getName();
            if (player[1].getCountWin() > max) {
                win = player[1].getName();
            }
            if (player[2].getCountWin() > max) {
                win = player[2].getName();
            }
            System.out.println("победил игрок " + win);
        }
    }

    private void clear() {
        for (int i = 0; i < 3; i++) {
            player[i].clearAttempts();
        }

    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n" + player.getName() + ", введите число: ");
            try {
                player.addNumber(scanner.nextInt());
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean compareNumbers(Player player, int attempt, int secretNumber) {
        int plNumber = player.getNumbers()[attempt - 1];
        if (plNumber == secretNumber) {
            System.out.println("\nПоздравляем!!! Игрок " + player.getName() +
                    " угадал число " + secretNumber + " с " + " попытки " + (attempt));
            player.addCountWin(player.getCountWin() + 1);
            return true;
        }
        System.out.println("\nИгрок " + player.getName() + " не угадал");
        System.out.println("Подсказка: число " + plNumber + (plNumber < secretNumber ? " меньше " :
                " больше ") + "того, что загадал компьютер");
        if (attempt == ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        return false;
    }

    private void printNumbers(Player[] player) {
        for (int i = 0; i < 3; i++) {
            System.out.print("\nЧисла игрока " + player[i].getName() + " ");
            int[] numbers = player[i].getNumbers();
            for (int number : numbers) {
                System.out.printf("%4d %s", number, " ");
            }
        }
    }
}