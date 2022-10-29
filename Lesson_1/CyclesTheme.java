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
        while (num5 > 0 ) {
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
            i -=2;
            System.out.println();
            }

        System.out.println("\n5. Проверка количества единиц на четность");

        int num6 = 3141591;
        int sumOnce = 0;
        int tmp = num6;
        while (tmp > 0) {
            if (tmp % 10 == 1) {
              sumOnce++;
            }
            tmp = tmp /10;
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

        i = 1;
        while (i <= 3) {
            int j = 0;
            while (j < i) {
                System.out.print ('$');
                j ++;
            }
            System.out.println ();
            i ++;
        }
        int k = 0;
        while (k < 2) {
            int h = k;
            while (h < 2 ) {
                System.out.print("$");
                h++;
            }
            System.out.println();
            k++;
        }

        System.out.println("\n7. Отображение ASCII-символов");

        //Отображение ASCII-символов
        //отобразите, используя for, данные столбцов Dec и Char (и названия столбцов) из таблицы
        //выведите на консоль:
        //символы, идущие до цифр и имеющие нечетные коды
        //маленькие английские буквы, имеющие четные коды
        //данные каждого столбца должны быть выровнены по правому краю




        //
        //Проверка, является ли число палиндромом
        //дано число 1234321
        //проверьте, является ли оно палиндромом (читается одинаково с любой стороны)
        //использовать Math.pow нельзя
        //отобразите в консоли:
        //число X является палиндромом
        //
        //Определение, является ли число счастливым
        //счастливым называется число, сумма первых трех цифр которого равна сумме последних
        //возьмите любое шестизначное число
        //подсчитайте сумму каждой тройки его цифр
        //отобразите в консоли:
        //каждую тройку цифр в формате “Сумма цифр abc = sum”
        //является число счастливым или нет
        //
        //Вывод таблицы умножения Пифагора
        //отобразите таблицу умножения в точности, как в образце, включая горизонтальные и вертикальные линии
        //не добавляйте между строками и столбцами лишние пустоты
        //используйте цикл for
    }
}
