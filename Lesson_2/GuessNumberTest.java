package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
//        System.out.println(GuessNumber.getRandomNumber());
        System.out.println("\nДобро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в полуинтервале (0, 100], " +
                "кто первый угадал, тот и выиграл.");
        System.out.println("Введите имя первого игрока : ");
        Player playerOne = new Player(scanner.next());
        System.out.println("Введите имя второго игрока : ");
        Player playerTwo = new Player(scanner.next());

        do {
            Random random = new Random();
            System.out.println(GuessNumber.unknownNum);
            System.out.println("введите число первого игрока: ");
            playerOne.setNumber(scanner.nextInt());
            GuessNumber.play(playerOne.getName(), playerOne.getNumber());
            if (playerOne.getNumber() != GuessNumber.unknownNum) {
                System.out.println("введите число второго игрока: ");
                playerTwo.setNumber(scanner.nextInt());
                GuessNumber.play(playerTwo.getName(), playerTwo.getNumber());
            }
            do {
                System.out.println("Хотите начать новую игру? [yes/no]");
                userAnswer = scanner.next();
            } while (!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while (userAnswer.equals("yes"));
    }
}
