package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в полуинтервале (0, 100], " +
                "кто первый угадал тот и выиграл.");
        System.out.print("Введите имя первого игрока: ");
//        Player pl1 = new Player("max");
        Player pl1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
//        Player pl2 = new Player("xam");
        Player pl2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(pl1, pl2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
    }
}