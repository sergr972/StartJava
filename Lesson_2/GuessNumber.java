package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    public static void guessNumber(Player playerOne, Player playerTwo) {
        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 100) + 1;
        System.out.println(unknownNumber);
        System.out.println("Введите число первого игрока: ");
        playerOne.setNumber(scanner.nextInt());
        if (playerOne.getNumber() == unknownNumber) {
            System.out.println("Поздравляем!!! Победил игрок " + playerOne.getName() +
                    ". \nЭто было число  - " + unknownNumber);
        } else {
            play(playerOne.getName(), playerOne.getNumber(), unknownNumber);
            System.out.println("Введите число второго игрока: ");
            playerTwo.setNumber(scanner.nextInt());
            if (playerTwo.getNumber() == unknownNumber) {
                System.out.println("Поздравляем!!! Победил игрок " + playerTwo.getName() +
                        ". \nЭто было число  - " + unknownNumber);
            } else {
                play(playerTwo.getName(), playerTwo.getNumber(), unknownNumber);
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
