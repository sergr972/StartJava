package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
//        System.out.println("1. Подсчет суммы четных и нечетных чисел");
//        int X = 0;
//        int Y = 0;
//        int i = -10;
//        do {
//            if (i % 2 == 0) {
//                X += i;
//            } else {
//                Y += i;
//            }
//            i++;
//        } while (i <= 21);
//        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + X + ", нечетных = " + Y);

//        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
//        int num1 = -1, num2 = 5, num3 = 10;
//        int j;
//        for (j = num3 -1; j > num1; j--) {
//            if (j != num2)
//                System.out.print(j + " ");
//        }

//        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
//        int num4 = 1234;
//        int sum = 0;
//        System.out.print("исходное число в обратном порядке - ");
//        while (num4 > 0 ) {
//            System.out.print(num4 % 10);
//            sum += num4 % 10;
//            num4 = num4 / 10;
//        }
//        System.out.println("\nсумма цифр исходного числа - " + sum);

//        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        //выведите с помощью for на консоль числа в полуинтервале [1, 24)
        //шаг итерации 2
        //отображайте в каждой строке по 5 чисел
        //отделяйте их друг от друга необходимым количеством пробелов
        //не указывайте впереди числа нули
        //выравнивайте числа в каждом столбце по правому краю, используя форматированный (1, 2) вывод с помощью printf
        //недостающее в последней строке до 5 количество чисел заполните нулями
        //число нулей определяйте программно. Не считайте их в уме и не пишите сами
//        for (int k = 1, h = 1;  k < 24; k += 2, h++) {
////            if (k < 24) {
//                System.out.printf("%2d,%s", k, h % 5 != 0 ? " " : "\n");
////            } else {
////                System.out.printf("%4d", 0);
////            }
//        }

//        for (int k = 1; k < 24; k+= 2) {
//            for (int h = 0; h < 5; h++) {
//                if (k < 24) {
//                    System.out.printf("%4d", k);
//                    } else {
//                    System.out.printf("%4d", 0);
//                    }
//                k += 2;
//                }
//            k -=2;
//            System.out.println();
//            }

        System.out.println("\n5. Проверка количества единиц на четность");
        //дано число 3141591
        //проверьте в цикле while, является ли количество цифр 1 четным
        //отобразите результат:
        //число X содержит N (четное/нечетное) количество единиц
        int X = 3141591;
        int N = 0;
        int tmp = X;
        while (tmp > 0) {
            if (tmp % 10 == 1) {
              N++;
            }
            tmp = tmp /10;
        }
        System.out.printf("число %d содержит %d%s количество единиц" , X, N, N % 2 == 0 ? " - четное" : " - нечетное");
//        if (N % 2 == 0) {
//            System.out.println("число " + X + " содержит " + N + " - четное количество единиц");
//        } else {
//            System.out.println("число " + X + " содержит " + N + " - нечетное количество единиц");
//        }

        System.out.println("\n6. Отображение фигур в консоли");

        //отобразите геометрические фигуры, используя:
        //для прямоугольника только for
        //для прямоугольного треугольника только while
        //для второго треугольника только do-while
        //каждую фигуру выводите на новой строке
        //**********    #####    $
        //**********    ####     $$
        //**********    ###      $$$
        //**********    ##       $$
        //**********    #        $
        //
        //
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