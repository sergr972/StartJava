package Lesson_2;

public class GuessNumber {
    public static void play(String player, int playerNum, int unknownNum) {
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
