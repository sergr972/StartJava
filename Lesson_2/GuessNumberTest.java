package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 100) + 1;
        System.out.println(unknownNumber);
        System.out.println("\nДобро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в полуинтревале (0, 100], " +
                "кто первый угадал тот и выиграл.");
        String name = "";
        int number = 0;
        Player playerOne = new Player(name, number);
        Player playerTwo = new Player(name, number);
        System.out.println("Введите имя первого игрока : ");
        playerOne.setName(scanner.next());
        System.out.println("Введите имя второго игрока : ");
        playerTwo.setName(scanner.next());
        do {
            System.out.println("введите число первого игрока: ");
            playerOne.setNumber(scanner.nextInt());
            GuessNumber.play(playerOne.getName(), playerOne.getNumber(), unknownNumber);
            if (playerOne.getNumber() != unknownNumber) {
                System.out.println("введите число второго игрока: ");
                playerTwo.setNumber(scanner.nextInt());
                GuessNumber.play(playerTwo.getName(), playerTwo.getNumber(), unknownNumber);
            }
        } while (playerOne.getNumber() != unknownNumber && playerTwo.getNumber() != unknownNumber);
    }
}
