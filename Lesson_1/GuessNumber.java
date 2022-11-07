package Lesson_1;

public class GuessNumber {
    public static void main(String[] args) {
        int playerNumber = 21;
        int unknownNumber = 20;
        if (playerNumber > 0 && playerNumber <= 100) {
            if (playerNumber < unknownNumber) {
                System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
            } else if (playerNumber > unknownNumber) {
                System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        }
    }
}
