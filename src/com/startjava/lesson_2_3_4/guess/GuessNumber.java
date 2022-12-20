package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        shuffle();
        out:
        for (int i = 1; i <= ROUNDS_LIMIT; i++) {
            System.out.println("\n\nРаунд " + i);
            clear();
            int secretNumber = (int) (Math.random() * 100) + 1;
            System.out.println(secretNumber);
            for (int j = 0; j < ATTEMPTS_LIMIT; j++) {
                for (Player player : players) {
                    inputNumber(player);
                    if (compareNumbers(player, j + 1, secretNumber)) {
                        printNumbers(this.players);
                        continue out;
                    }
                }
            }
        }
        System.out.print("\n\nПо результатам 3-х раундов - ");
        if (players[0].getCountWin() == players[1].getCountWin() &&
                players[2].getCountWin() == players[1].getCountWin()) {
            System.out.println("ничья");
        } else {
            int max = players[0].getCountWin();
            String win = players[0].getName();
            if (players[1].getCountWin() > max) {
                win = players[1].getName();
            }
            if (players[2].getCountWin() > max) {
                win = players[2].getName();
            }
            System.out.println("победил игрок " + win);
        }
    }

    private void shuffle() {
        Random rand = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Player tmp = players[index];
            players[index] = players[i];
            players[i] = tmp;
        }
    }

    private void clear() {
        for (int i = 0; i < 3; i++) {
            players[i].clearAttempts();
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

    private void printNumbers(Player[] players) {
        for (int i = 0; i < 3; i++) {
            System.out.print("\nЧисла игрока " + players[i].getName() + " ");
            int[] numbers = players[i].getNumbers();
            for (int number : numbers) {
                System.out.printf("%4d %s", number, " ");
            }
        }
    }
}