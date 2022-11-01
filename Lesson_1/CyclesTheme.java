package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int num1 = -10;
        do {
            if (num1 % 2 == 0) {
                sumEvenNum += num1;
            } else {
                sumOddNum += num1;
            }
            num1++;
        } while (num1 <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + ", нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num2 = -1, num3 = 5, num4 = 10;
        int min = 0, max = 0;
        if  (num2 < num3 && num2 < num4) {
            min = num2;
        } else if (num3 < num2 && num3 < num4) {
            min = num3;
        } else {
            min = num4;
        }
        if  (num2 > num3 && num2 > num4) {
            max = num2;
        } else if (num3 > num2 && num3 > num4) {
            max = num3;
        } else {
            max = num4;
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
        int rows1 = 5;
        int columns1 = 10;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int rows2 = 5;
        int columns2 = 5;
        int i = 0;
        do {
            int j = i;
            do {
                System.out.print("#");
                j++;
            } while (j < columns2);
            System.out.println();
            i++;
        } while (i < rows2);
        System.out.println();

        int columns3 = 0;
        int rows3 = 5;
        i = 1;
        while (i <= rows3) {
            if (i <= 3) {
                columns3++;
            } else {
                columns3--;
            }
            int j = 0;
            while (j < columns3) {
                System.out.print('$');
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%3s","Dec  Char");
        System.out.println();
        for (int dec = 0; dec <= 127; dec++) {
            char ch = (char)dec;
            if (((dec > 0 & dec <= 47) & (dec % 2 != 0)) || ((dec >= 97 & dec <= 122) & (dec % 2 ==0))) {
                System.out.printf("%3d%4c", dec, ch);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num7 = 1234321;
        int tmp2 = num7;
        int reverse = 0;
        while (tmp2 > 0) {
            reverse += tmp2 % 10;
            tmp2 = tmp2 / 10;
            if (tmp2 > 0) reverse *= 10;
        }
        System.out.print(num7);
        if (num7 == reverse) {
            System.out.println(" - палиндром");
        } else {
            System.out.println(" - не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int num8 = 345543;
        int abc = 0;
        int def = 0;
        while (num8 > 0) {
            for (i = 0; i < 3; i++) {
                def += num8 % 10;
                num8 = num8 / 10;
            }
            for (i = 0; i < 3; i++) {
                abc += num8 % 10;
                num8 = num8 / 10;
            }
        }
        if (abc == def) {
            System.out.println("Сумма цифр abc = " + abc + "\nСумма цифр def = " + def);
            System.out.println("Число счастливое") ;
        } else{
            System.out.println("Сумма цифр abc = " + abc + "\nСумма цифр def = " + def);
            System.out.println("Число несчастливое") ;
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("     ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for( i=2; i<10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.print("\n---|------------------------\n");
        for(i=2; i<10; i++) {
            System.out.printf("%2d |", i);
            for(int j=2; j<10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}

