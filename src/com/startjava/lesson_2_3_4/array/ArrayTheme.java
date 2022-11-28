package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int length = intArr.length;
        System.out.println("массив до модификации");
        printIntArray(intArr);
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            int tmp = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = tmp;
        }
        System.out.println("\nмассив после модификации");
        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int mult = 1;
        for (int i = 1; i < length - 1; i++) {
            mult *= intArr[i];
            System.out.print(i < 8 ? intArr[i] + " * " : intArr[i] + " = ");
        }
        System.out.println(mult);
        System.out.print("значение массива с индексом 0 равно " + intArr[0]);
        System.out.print("\nзначение массива с индексом 9 равно " + intArr[9]);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        int averageIndex = length / 2;
        double middleNum = doubleArr[averageIndex];
        System.out.println("индекс средней ячейки - " + averageIndex);
        System.out.printf("%s %.3f %s", "число средней ячейки - ", middleNum, "\n\n");
        System.out.println("исходный массив");
        printDoubleArray(doubleArr);
        int countZero = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleNum) {
                doubleArr[i] = 0;
                countZero++;
            }
        }
        System.out.println("\nизмененный массив");
        printDoubleArray(doubleArr);
        System.out.println("\nколичество обнуленных ячеек - " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alfabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alfabet[i] = (char) (i + 65);
        }
        for (int i = alfabet.length - 1; i >= 0; i--) {
            for (int j = alfabet.length - 1; j >= i; j--) {
                System.out.print(alfabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        intArr = new int[30];
        for (int i = 0; i < 30; ) {
            int randomNumber = (int) (Math.random() * 40 + 60);
            int j;
            for (j = 0; j < i; j++) {
                if (intArr[j] == randomNumber) {
                    break;
                }
            }
            if (j == i) {
                intArr[i] = randomNumber;
                i++;
            }
        }
        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < intArr.length) {
                    System.out.printf("%2d %s", intArr[i], " ");
                }
                i++;
            }
            i--;
            System.out.println();
        }
    }

    private static void printIntArray(int[] array) {
        for (int numArray : array) {
            System.out.print(numArray + " ");
        }
    }

    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (i < array.length) {
                    System.out.printf("%.3f %s", array[i], " ");
                }
                i++;
            }
            i--;
            System.out.println();
        }
    }
}
