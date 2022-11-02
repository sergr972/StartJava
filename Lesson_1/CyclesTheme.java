package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + ", нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num2 = -1, num3 = 5, num4 = 10;
        int min = num2, max = num2;
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        System.out.println(min + " - минимальное число");
        System.out.println(max + " - максимальное число");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num5 = 1234;
        int sumDigits = 0;
        System.out.print("исходное число в обратном порядке - ");
        while (num5 > 0) {
            int digit = num5 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num5 /= 10;
        }
        System.out.println("\nсумма цифр числа - " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i += 2) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%4d", i);
                } else {
                    System.out.printf("%4d", 0);
                }
                i += 2;
            }
            i -= 2;
            System.out.println();
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        int num6 = 3141591;
        int countOnes = 0;
        int copyNum6 = num6;
        while (copyNum6 > 0) {
            if (copyNum6 % 10 == 1) {
                countOnes++;
            }
            copyNum6 /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("число " + num6 + " содержит " + countOnes + " - четное количество единиц");
        } else {
            System.out.println("число " + num6 + " содержит " + countOnes + " - нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        int rows = 5;
        int columns = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        rows = 5;
        columns = 5;
        int i = 0;
        do {
            int j = i;
            do {
                System.out.print("#");
                j++;
            } while (j < columns);
            System.out.println();
            i++;
        } while (i < rows);
        System.out.println();

        rows = 5;
        columns = 0;
        i = 1;
        while (i <= rows) {
            if (i <= 3) {
                columns++;
            } else {
                columns--;
            }
            int j = 0;
            while (j < columns) {
                System.out.print('$');
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%3s","Dec  Char\n");
        for (int dec = 0; dec <= 127; dec++) {
            char ch = (char)dec;
            if (((dec > 0 & dec <= 47) && (dec % 2 != 0)) || ((dec >= 97 && dec <= 122) & (dec % 2 == 0))) {
                System.out.printf("%3d%4c\n", dec, ch);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num7 = 1234321;
        int copyNum7 = num7;
        int reverse = 0;
        while (copyNum7 > 0) {
            reverse += copyNum7 % 10;
            copyNum7 /= 10;
            if (copyNum7 > 0) reverse *= 10;
        }
        System.out.print(num7);
        if (num7 == reverse) {
            System.out.println(" - палиндром");
        } else {
            System.out.println(" - не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num8 = 345543;
        int leftNum8 = num8 / 1000;
        int rightNum8 = num8 % 1000;
        int sumRightNum8 = 0, sumLeftNum8 = 0;
        for (int j = 1, k = 6; j <= 3 && k >= 4; j++, k--) {
            sumRightNum8 += rightNum8 % 10;
            rightNum8 /= 10;
            sumLeftNum8 += leftNum8 % 10;
            leftNum8 /= 10;
        }
        System.out.println("Сумма цифр abc = " + sumLeftNum8 + "\nСумма цифр def = " + sumRightNum8);
        System.out.println(sumRightNum8 == sumLeftNum8 ? "Число счастливое" : "Число несчастливое") ;


        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("     ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for( i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.print("\n---|------------------------\n");
        for(i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}

