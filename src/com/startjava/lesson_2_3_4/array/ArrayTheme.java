package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        /*
        заполните массив числами вразнобой в промежутке [1, 7], используя сокращенную форму инициализации
        переставьте значения в исходном массиве в обратном порядке
        при этом берите значения для перезаписи из самого массива
        не используйте сортировку
        отобразите значения массива в две строки до модификации и после, отделяя числа друг от друга пробелом
         */
        int[] userArray = {1, 2, 3, 4, 5, 6, 7};
        int[] newArray = new int[userArray.length];
        System.out.println("массив до модификации");
        for (int i = 0, j = userArray.length - 1; i < userArray.length; i++, j--) {
            System.out.print(userArray[i] + " ");
            newArray[i] = userArray[j];
        }
        System.out.println("\nмассив после модификации");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println("\n2. Вывод произведения элементов массива");
        /*заполните массив в цикле цифрами в промежутке [0, 9]
        подсчитайте их произведение (без учета 0 и 9). Числа берите из массива
        отобразите:
        в цикле числа и результат в формате 1 * … * 8 = X
        0 и 9 (берите из массива) отдельной строкой, указав их индексы
        для проверки выводимого результата используйте тернарный оператор вместо if
        */
        int[] nums1 = new int[10];
        for (int i = 0; i < 10; i++) {
            nums1[i] = i;
        }
        int mult = 1;
        for (int i = 1; i < 9; i++) {
            mult *= nums1[i];
        }
        System.out.println(mult);


//        System.out.println("\n3. Удаление элементов массива");
//        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
//        System.out.println("\n5. Генерация уникальных чисел");
//        System.out.println("\n6. Сдвиг элементов массива");

    }
}
