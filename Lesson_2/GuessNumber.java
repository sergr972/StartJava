package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    private final Player playerOne;
    private final Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public static  void  guess(Player playerOne, Player playerTwo) {
        Scanner scanner = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println(secretNum);
        System.out.println("Введите число первого игрока: ");
        playerOne.setNumber(scanner.nextInt());
        if (!compareNumbers(playerOne, secretNum)) {
            System.out.println("Введите число второго игрока: ");
            playerTwo.setNumber(scanner.nextInt());
            compareNumbers(playerTwo, secretNum);
        }
    }

    private static boolean compareNumbers(Player player, int secretNum) {
        if (player.getNumber() == secretNum) {
            System.out.println("Поздравляем!!! Победил игрок " + player.getName() +
                    ". \nЭто было число  - " + secretNum);
            return true;
        } else {
            System.out.println("Игрок " + player.getName() + " не угадал");
            System.out.println("Подсказка : ");
            if (player.getNumber() < secretNum) {
                System.out.println("число " + player.getName() +
                        " меньше того, что загадал компьютер");
            }
            if (player.getNumber() > secretNum) {
                System.out.println("число " + player.getName() +
                        " больше того, что загадал компьютер");
            }
            return false;
        }
    }
}


