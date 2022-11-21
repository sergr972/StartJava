package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в полуинтервале (0, 100], " +
                "кто первый угадал тот и выиграл.");
        System.out.println("Введите имя первого игрока : ");
        Player playerOne = new Player(scanner.next());
        System.out.println("Введите имя второго игрока : ");
        Player playerTwo = new Player(scanner.next());
        String playerAnswer;

        do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.start();
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]");
                playerAnswer = scanner.next();
            } while (!playerAnswer.equals("no") && !playerAnswer.equals("yes"));
        } while (playerAnswer.equals("yes"));
    }
}