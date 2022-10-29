package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sum1 = 0;
        int sum2 = 0;
        int num1 = -10;
        do {
            if (num1 % 2 == 0) {
                sum1 += num1;
            } else {
                sum2 += num1;
            }
            num1++;
        } while (num1 <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sum1 + ", нечетных = " + sum2);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num2 = -1, num3 = 5, num4 = 10;
        for (int i = num4 - 1; i > num2; i--) {
            if (i != num3)
                System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num5 = 1234;
        int sumReverse = 0;
        System.out.print("исходное число в обратном порядке - ");
        while (num5 > 0) {
            System.out.print(num5 % 10);
            sumReverse += num5 % 10;
            num5 = num5 / 10;
        }
        System.out.println("\nсумма цифр исходного числа - " + sumReverse);

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
        int sumOnce = 0;
        int tmp1 = num6;
        while (tmp1 > 0) {
            if (tmp1 % 10 == 1) {
                sumOnce++;
            }
            tmp1 = tmp1 / 10;
        }
        if (sumOnce % 2 == 0) {
            System.out.println("число " + num6 + " содержит " + sumOnce + " - четное количество единиц");
        } else {
            System.out.println("число " + num6 + " содержит " + sumOnce + " - нечетное количество единиц");
        }
//        System.out.printf("число %d содержит %d%s количество единиц" , num6, sumOnce, sumOnce % 2 == 0 ? " - четное" : " - нечетное");

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int i = 0;
        do {
            int j = i;
            do {
                System.out.print("#");
                j++;
            } while (j < 5);
            System.out.println();
            i++;
        } while (i < 5);
        System.out.println();

        i = 0;
        while (i <= 3) {
            int j = 0;
            while (j < i) {
                System.out.print('$');
                j++;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < 2) {
            int j = i;
            while (j < 2) {
                System.out.print("$");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n7. Отображение ASCII-символов");
//        //Отображение ASCII-символов
//        //отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
//        //выведите на консоль:
//        //символы, идущие до цифр и имеющие нечетные коды
//        //маленькие английские буквы, имеющие четные коды
//        //данные каждого столбца должны быть выровнены по правому краю




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

