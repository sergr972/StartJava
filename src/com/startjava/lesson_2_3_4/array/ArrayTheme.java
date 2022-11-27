package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
//        System.out.println("1. Реверс значений массива");
//        /*
//        заполните массив числами вразнобой в промежутке [1, 7], используя сокращенную форму инициализации
//        переставьте значения в исходном массиве в обратном порядке
//        при этом берите значения для перезаписи из самого массива
//        не используйте сортировку
//        отобразите значения массива в две строки до модификации и после, отделяя числа друг от друга пробелом
//         */
        int[] intArr;
//        intArr = {1, 3, 2, 5, 4, 7, 6};
//        int[] newArray = new int[intArr.length];
//        System.out.println("массив до модификации");
//        for (int i = 0, j = intArr.length - 1; i < intArr.length; i++, j--) {
//            System.out.print(intArr[i] + " ");
//            newArray[i] = intArr[j];
//        }
//        System.out.println("\nмассив после модификации");
//        for (int numNewArray : newArray) {
//            System.out.print(numNewArray + " ");
//        }

//        System.out.println("\n\n2. Вывод произведения элементов массива");
        /*заполните массив в цикле цифрами в промежутке [0, 9]
        подсчитайте их произведение (без учета 0 и 9). Числа берите из массива
        отобразите:
        в цикле числа и результат в формате 1 * … * 8 = X
        0 и 9 (берите из массива) отдельной строкой, указав их индексы
        для проверки выводимого результата используйте тернарный оператор вместо if
        */
//        intArr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            intArr[i] = i;
//        }
//        int mult = 1;
//        for (int i = 1; i < 9; i++) {
//            mult *= intArr[i];
//            System.out.print(i < 8 ? intArr[i] + " * " : intArr[i] + " = ");
//        }
//        System.out.println(mult);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(intArr[i] == 0 ? "индекс числа " + intArr[i] + " равен " + i : "");
//            System.out.print(intArr[i] == 9 ? "\nиндекс числа " + intArr[i] + " равен " + i : "");
//        }
//        //через метод
//        System.out.println("\nиндекс числа 0 равен " + Arrays.binarySearch(intArr, 0));
//        System.out.println("индекс числа 9 равен " + Arrays.binarySearch(intArr, 9));

        System.out.println("\n3. Удаление элементов массива");
//        заполните массив размерностью 15 случайными вещественными числами в полуинтервале [0, 1)
//        вычислите индекс средней ячейки массива, а затем возьмите из нее число
//        перезапишите в массиве 0 все числа, которые больше этого значения
//        отобразите:
//        исходный и измененный массив по 8 и 7 чисел в строке
//        при этом после запятой отображайте только три знака
//        выделяйте под каждое число с помощью форматирования одинаковое количество позиций, чтобы числа были выровнены в каждом столбце по правому краю
//        количество обнуленных ячеек
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length - 1; i++) {
            doubleArr[i] = Math.random();
        }
        int averageIndex = doubleArr.length/2;
        double averageNum = doubleArr[averageIndex];
        System.out.println("индекс средней ячейки - " + averageIndex);
        System.out.printf("%s %.3f %s","число средней ячейки - ", averageNum, "\n\n");

        System.out.println("исходный массив");
        printArray(doubleArr);
        double[] mutableArray = new double[15];
        for (int i = 0; i < doubleArr.length-1; i++) {
            if (doubleArr[i] > 0) {
                mutableArray[i] = 0;
            } else {
                mutableArray[i] = doubleArr[i];
            }
        }
        System.out.println("измененный массив");
        printArray(mutableArray);


//        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
//        System.out.println("\n5. Генерация уникальных чисел");
//        System.out.println("\n6. Сдвиг элементов массива");

    }

    private static void printArray(double[] array) {
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
