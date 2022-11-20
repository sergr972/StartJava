package Lesson_2;

import java.util.Scanner;

public class GuessNumber {

    private final Player playerOne;
    private final Player playerTwo;
    boolean result;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println(secretNum);

        do {
            System.out.println("Введите число первого игрока: ");
            playerOne.setNumber(scanner.nextInt());
            compareNumbers(playerOne, secretNum);
            if (!result) {
                System.out.println("Введите число второго игрока: ");
                playerTwo.setNumber(scanner.nextInt());
                compareNumbers(playerTwo, secretNum);
            }
        } while (!result);
    }

    private boolean compareNumbers(Player player, int secretNum) {
        if (player.getNumber() < secretNum) {
            System.out.println("Игрок " + player.getName() + " не угадал");
            System.out.println("Подсказка : ");
            System.out.println("число " + player.getNumber() +
                    " меньше того, что загадал компьютер");
        }
        if (player.getNumber() > secretNum) {
            System.out.println("Игрок " + player.getName() + " не угадал");
            System.out.println("Подсказка : ");
            System.out.println("число " + player.getNumber() +
                    " больше того, что загадал компьютер");
        }
        if (player.getNumber() == secretNum) {
            System.out.println("Поздравляем!!! Победил игрок " + player.getName() +
                    ". \nЭто было число  - " + secretNum);
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
