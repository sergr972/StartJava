package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 100);
        System.out.println(unknownNumber);

        System.out.println("Добро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в полуинтревале (0, 100], " +
                "кто первый угадал тот и выиграл.");
        System.out.println("Введите имя первого игрока : ");
        Player playerOne = new Player(scanner.next());
        System.out.println("Введите имя второго игрока : ");
        Player playerTwo = new Player(scanner.next());
        int playerOneNumber;
        int playerTwoNumber = 0;
        do {
            System.out.println("Первый игрок введите число : ");
            playerOneNumber = scanner.nextInt();
            if (playerOneNumber == unknownNumber) {
                System.out.println("Поздравляем!!!Победил первый игрок!!! Это было число  - "
                        + unknownNumber);
            } else {
                System.out.println("Первый игрок не угадал, ход переходит");
                System.out.println("Подсказка : ");
                if (playerOneNumber < unknownNumber) {
                    System.out.println("число " + playerOneNumber + " меньщше того, что загадал компьютер");
                }
                if (playerOneNumber > unknownNumber) {
                    System.out.println("число " + playerOneNumber + " больше того, что загадал компьютер");
                }
                System.out.println("Второй игрок введите число : ");
                playerTwoNumber = scanner.nextInt();
                if (playerTwoNumber == unknownNumber) {
                    System.out.println("Поздравляем!!!Победил второй игрок!!! Это было число  - "
                            + unknownNumber);
                } else {
                    System.out.println("Второй игрок не угадал.\n");
                    System.out.println("Подсказка : ");
                    if (playerTwoNumber < unknownNumber) {
                        System.out.println("число " + playerTwoNumber + " меньщше того, что загадал компьютер\n");
                    }
                    if (playerTwoNumber > unknownNumber) {
                        System.out.println("число " + playerTwoNumber + " больше того, что загадал компьютер\n");
                    }
                }
            }
        } while (playerOneNumber != unknownNumber || playerTwoNumber != unknownNumber) ;
    }
}
