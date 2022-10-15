package Lesson_1;

class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numCore = 2;
        short ram  = 8;
        int ssd = 520;
        long freqCpu = 2400;
        float weight = 2.7f;
        double diag = 15.6;
        boolean sale = false;
        char model = 'N';
        System.out.println("Количество ядер процессора: " + numCore + "\nЧастота процессора, Ггц: " + freqCpu
                + "\nОбъём ОЗУ, Гб: " + ram + "\nОбъём SSD, Гб: " + ssd + "\nВес, кг: " + weight
                + "\nДиагональ экрана: " + diag + "\nДоступен в продаже: " + sale
                +  "\nМодель: "+ model);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int sum = pricePen + priceBook;
        double discount = sum * 0.11;
        double discountPrice = sum - discount;
        System.out.println("I. Сумма скидки: " + discount);
        System.out.println("II. Общая стоимость товара со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Максимальное значение byte: " + maxByte);
        System.out.println("Значение byte после инкремента: " + ++maxByte);
        System.out.println("Значение byte после декремента: " + --maxByte);
        short maxShort = 32767;
        System.out.println("Максимальное значение short: " + maxShort);
        System.out.println("Значение short после инкремента: " + ++maxShort);
        System.out.println("Значение short после декремента: " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("Максимальное значение int: " + maxInt);
        System.out.println("Значение int после инкремента: " + ++maxInt);
        System.out.println("Значение int после декремента: " + --maxInt);
        long maxLong  = 9223372036854775807L;
        System.out.println("Максимальное значение long: " + maxLong);
        System.out.println("Значение long после инкремента: " + ++maxLong);
        System.out.println("Значение long после декремента: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("i. с помощью третьей переменной");
        System.out.println("исходные значения переменных num1 = " + num1 + " ,num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("новые значения переменных num1 = " + num1 + ", num2 = " + num2);
        System.out.println("ii. с помощью арифметических операций");
        System.out.println("исходные значения переменных num1 = " + num1 + ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных num1 = " + num1 + ", num2 = " + num2);
        System.out.println("iii. с помощью побитовой операции");
        System.out.println("исходные значения переменных num1 = " + num1 + ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println((int) ch1 + " - " + ch1);
        System.out.println((int) ch2 + " - " + ch2);
        System.out.println((int) ch3 + " - " + ch3);
        System.out.println((int) ch4 + " - " + ch4);
        System.out.println((int) ch5 + " - " + ch5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num3 = 123;
        int x = num3 / 100;
        int y = num3 % 100 / 10;
        int z = num3 % 10;
        System.out.println("Число " + num3 + " содержит сотен "+ x);
        System.out.println("Число " + num3 + " содержит десятков "+ y);
        System.out.println("Число " + num3 + " содержит единиц "+ z);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openParenthesis + " " + closeParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int num4 = 345;
        int digit1 = num4 / 100;
        int digit2 = num4 % 100 / 10;
        int digit3 = num4 % 10;
        int sumDigits = digit1 + digit2  + digit3;
        int multDigits = digit1 * digit2 * digit3;
        System.out.println("Сумма цифр числа " + num4 + " = " + sumDigits);
        System.out.println("Произведение цифр числа " + num4 + " = " + multDigits);

        System.out.println("\n10. Преобразование секунд");
        int seconds = 86399;
        int hour = seconds / 3600;
        int min = seconds % 3600 / 60;
        int sec = seconds % 60;
        System.out.println("в " + seconds + " секундах: " + hour  + ":" + min + ":" + sec);
    }
}
