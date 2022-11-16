package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    Player playerOne;
    Player playerTwo;

    public GuessNumber (Player playerOne, Player playerTwo) {

        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 100) + 1;
        System.out.println(unknownNumber);
        System.out.println("Введите число первого игрока: ");
        playerOne.setNumber(scanner.nextInt());
        compare(playerOne.getName(), playerOne.getNumber(), unknownNumber);
        if (playerOne.getNumber() != unknownNumber) {
            System.out.println("Введите число второго игрока: ");
            playerTwo.setNumber(scanner.nextInt());
            compare(playerTwo.getName(), playerTwo.getNumber(), unknownNumber);
        }
    }

    private static void compare(String player, int number, int unknownNumber) {
        if (number == unknownNumber) {
            System.out.println("Поздравляем!!! Победил игрок " + player +
                    ". \nЭто было число  - " + unknownNumber);
            } else {
            System.out.println("Игрок " + player + " не угадал, ход переходит");
            System.out.println("Подсказка : ");
            if (number < unknownNumber) {
                System.out.println("число " + number + " меньше того, что загадал компьютер");
            }
            if (number > unknownNumber) {
                System.out.println("число " + number + " больше того, что загадал компьютер");
            }
        }
    }
}

