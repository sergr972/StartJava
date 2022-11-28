package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr;
        int i, j;
        intArr = new int[]{1, 3, 2, 5, 4, 7, 6};
        int[] newArray = new int[intArr.length];
        System.out.println("массив до модификации");
        printArray1(intArr);
        for (i = 0, j = intArr.length - 1; i < intArr.length; i++, j--) {
            newArray[i] = intArr[j];
        }
        System.out.println("\nмассив после модификации");
        printArray1(newArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        for (i = 0; i < 10; i++) {
            intArr[i] = i;
        }
        int mult = 1;
        for (i = 1; i < 9; i++) {
            mult *= intArr[i];
            System.out.print(i < 8 ? intArr[i] + " * " : intArr[i] + " = ");
        }
        System.out.println(mult);
        for (i = 0; i < 10; i++) {
            System.out.print(intArr[i] == 0 ? "индекс числа " + intArr[i] + " равен " + i : "");
            System.out.print(intArr[i] == 9 ? "\nиндекс числа " + intArr[i] + " равен " + i : "");
        }
        //через метод
        System.out.println("\nиндекс числа 0 равен " + Arrays.binarySearch(intArr, 0));
        System.out.println("индекс числа 9 равен " + Arrays.binarySearch(intArr, 9));

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        for (i = 0; i < doubleArr.length - 1; i++) {
            doubleArr[i] = Math.random();
        }
        int averageIndex = doubleArr.length / 2;
        double averageNum = doubleArr[averageIndex];
        System.out.println("индекс средней ячейки - " + averageIndex);
        System.out.printf("%s %.3f %s", "число средней ячейки - ", averageNum, "\n\n");
        System.out.println("исходный массив");
        printArray2(doubleArr);
        double[] mutableArray = new double[15];
        int countZero = 0;
        for (i = 0; i < doubleArr.length - 1; i++) {
            if (doubleArr[i] > 0) {
                mutableArray[i] = 0;
                countZero++;
            } else {
                mutableArray[i] = doubleArr[i];
            }
        }
        System.out.println("\nизмененный массив");
        printArray2(mutableArray);
        System.out.println("\nколичество обнуленных ячеек - " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alfabet = new char[26];
        for (i = 0; i < 26; i++) {
            alfabet[i] = (char) (i + 65);
        }
        for (i = alfabet.length - 1; i >= 0; i--) {
            for (j = alfabet.length - 1; j >= i; j--) {
                System.out.print(alfabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        intArr = new int[30];
        for (i = 0; i < 30; ) {
            int randomNumber = (int) (Math.random() * 40 + 60);
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
        for (i = 0; i < intArr.length - 1; i++) {
            for (j = 0; j < 10; j++) {
                if (i < intArr.length) {
                    System.out.printf("%2d %s", intArr[i], " ");
                }
                i++;
            }
            i--;
            System.out.println();
        }
    }

    private static void printArray1(int[] array) {
        for (int numArray : array) {
            System.out.print(numArray + " ");
        }
    }

    private static void printArray2(double[] array) {
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
