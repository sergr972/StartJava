package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    public static void play(String player, int playerNum, int unknownNumber) {
        unknownNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(unknownNumber);
        System.out.println("введите число первого игрока: ");

        if (playerNum == unknownNumber) {
            System.out.println("Поздравляем!!! Победил игрок " + player + " Это было число  - "
                    + unknownNumber);
            } else {
            System.out.println("Игрок не угадал, ход переходит");
            System.out.println("Подсказка : ");
            if (playerNum < unknownNumber) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            }
            if (playerNum > unknownNumber) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            }
        }
    }
}
