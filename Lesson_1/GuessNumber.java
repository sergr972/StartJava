package Lesson_1;

public class GuessNumber {
    public static void main(String[] args) {
        int userNumber = 21;
        int unknownNumber = 20;
        if (userNumber > 0 & userNumber <= 100) {
            if (userNumber < unknownNumber) {
                System.out.println("число " + userNumber + " меньше того, что загадал компьютер");
            } else if (userNumber > unknownNumber) {
                System.out.println("число " + userNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        }

    }
}
