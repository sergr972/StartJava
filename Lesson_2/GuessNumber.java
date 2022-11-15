package Lesson_2;

import java.util.Random;

import static java.lang.Math.*;

public class GuessNumber {

    static Random random = new Random();
    static int unknownNum = random.nextInt(99) + 1;

    public static void play(String player, int playerNum) {


        if (playerNum == unknownNum) {
            System.out.println("Поздравляем!!! Победил игрок " + player + " Это было число  - "
                    + unknownNum);
            } else {
            System.out.println("Игрок не угадал, ход переходит");
            System.out.println("Подсказка : ");
            if (playerNum < unknownNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            }
            if (playerNum > unknownNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            }
        }
    }
}
