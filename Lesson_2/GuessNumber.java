package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    public static void guessNumber(String player, int playerNum) {
        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 100) + 1;
        System.out.println(unknownNumber);
        System.out.println("Введите число первого игрока: ");
        playerNum = scanner.nextInt();
        if (playerNum == unknownNumber) {
            System.out.println("Поздравляем!!! Победил игрок " + player + " Это было число  - "
                    + unknownNumber);
        } else {
            play(player, playerNum, unknownNumber);
            System.out.println("Введите число второго игрока: ");
            playerNum = scanner.nextInt();
            if (playerNum == unknownNumber) {
                System.out.println("Поздравляем!!! Победил игрок " + player + " Это было число  - "
                        + unknownNumber);
            } else {
                play(player, playerNum, unknownNumber);
            }
        }
    }

    private static void play(String player, int number, int unknownNumber) {
        System.out.println("Игрок " + player + " не угадал, ход переходит");
        System.out.println("Подсказка : ");
        if (number < unknownNumber) {
            System.out.println("число " + number + " меньше того, что загадал компьютер");
        }
        if (number > unknownNumber) {
            System.out.println("число " + number + " больше того, что загадал компьютер");
        }
    }
}
