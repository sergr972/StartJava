package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        Scanner scanner = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println(secretNum);
        System.out.println("Введите число первого игрока: ");
        playerOne.setNumber(scanner.nextInt());
        compareNumbers(playerOne.getName(), playerOne.getNumber(), secretNum);
        if (playerOne.getNumber() != secretNum) {
            System.out.println("Введите число второго игрока: ");
            playerTwo.setNumber(scanner.nextInt());
            compareNumbers(playerTwo.getName(), playerTwo.getNumber(), secretNum);
        }
    }

    private static void compareNumbers(String player, int number, int secretNum) {
        if (number == secretNum) {
            System.out.println("Поздравляем!!! Победил игрок " + player +
                    ". \nЭто было число  - " + secretNum);
        } else {
            System.out.println("Игрок " + player + " не угадал, ход переходит");
            System.out.println("Подсказка : ");
            if (number < secretNum) {
                System.out.println("число " + number + " меньше того, что загадал компьютер");
            }
            if (number > secretNum) {
                System.out.println("число " + number + " больше того, что загадал компьютер");
            }
        }
    }
}


