package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    int attempt;
    private final Player pl1;
    private final Player pl2;
    private static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        pl1.clearAttempts();
        pl2.clearAttempts();
        int secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println(secretNumber);
        for (int i = 0; i < ATTEMPTS_LIMIT; i++) {
            attempt = i + 1;
            inputNumber(pl1, attempt);
            if (compareNumbers(pl1, attempt, secretNumber)) {
                break;
            }
            inputNumber(pl2, attempt);
            if (compareNumbers(pl2, attempt, secretNumber)) {
                break;
            }
        }
        System.out.print("\nЧисла игрока " + pl1.getName() + " ");
        printNumbers(pl1.getNumbers());
        System.out.print("\nЧисла игрока " + pl2.getName() + " ");
        printNumbers(pl2.getNumbers());
    }

    private void inputNumber(Player player, int attempt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n" + player.getName() + ", введите число: ");
            player.setAttempt(attempt);
            try {
                player.addNumber(scanner.nextInt());
                return;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean compareNumbers(Player player, int attempt, int secretNumber) {
        int plNumber = player.getNumbers()[attempt - 1];
        if (plNumber == secretNumber) {
            System.out.println("\nПоздравляем!!! Игрок " + player.getName() +
                    " угадал число " + secretNumber + " с " + " попытки " + (attempt));
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

    private void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.printf("%4d %s", number, " ");
        }
    }
}