package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        System.out.println("\nДобро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют 3 игрока.");
        System.out.println("Нужно вводить число в полуинтервале (0, 100], " +
                "кто первый угадал тот и выиграл.");
        System.out.println("У каждого игрока 10 попыток");

        System.out.print("Введите имя первого игрока: ");
        players[0] = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        players[1] = new Player(scanner.nextLine());
        System.out.print("Введите имя третьего игрока: ");
        players[2] = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(players);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("\n\nРаунд " + (i + 1));
                    game.start();
                }
            }
            System.out.print("\n\nХотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();

        } while (!"no".equals(answer));
        System.out.println("Игра окончена!");
    }
}