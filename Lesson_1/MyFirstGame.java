package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int playerNumber = 15;
        int unknownNumber = 20;
        if (playerNumber > 0 && playerNumber <= 100) {
            while (playerNumber != unknownNumber) {
                if (playerNumber < unknownNumber) {
                    System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber++;
                }
                if (playerNumber > unknownNumber) {
                    System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber--;
                }
            }
            System.out.println("Вы победили!");
        } else {
            System.out.println("Введите целое число в полуинтервале (0, 100]");
        }
    }
}
