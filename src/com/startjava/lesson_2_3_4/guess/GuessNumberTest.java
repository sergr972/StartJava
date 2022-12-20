package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int NUMBER_OF_PLAYERS = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("""
                Добро пожаловать в игру "Угадай число".\s
                Нужно вводить числа в полуинтервале (0, 100].\s
                Играют 3 игрока, кто первый угадал, тот и выиграл.
                Победитель выявляется по результатам 3-х раундов
                У каждого игрока 10 попыток.
                """);
        Player[] players = new Player[NUMBER_OF_PLAYERS];
        createPlayer(players);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        System.out.println("Игра окончена!");
    }

    private static void createPlayer(Player... players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("\nВведите имя игрока номер " + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
    }
}