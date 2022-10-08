class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numCore = 2;
        short ram  = 8;
        int ssd = 520;
        long freqCpu = 2400;
        float weight = 2.7f;
        double diag = 15.6;
        System.out.println("Количество ядер процессора: " + numCore + "\nЧастота процессора, Ггц: " + freqCpu
                + "\nОбъём ОЗУ, Гб: " + ram + "\nОбъём SSD, Гб: " + ssd + "\nВес, кг: " + weight
                + "\nДиагональ экрана: " + diag);
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int sum = pricePen + priceBook;
        double discount = sum * 0.11;
        double res = sum - discount;
        System.out.println("I. Сумма скидки: " + discount);
        System.out.println("II. Общая стоимость товара со скидкой: " + res);
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Максимальное значение byte: " + maxByte);
        byte incByte = ++maxByte;
        System.out.println("Значение byte после инкремента: " + incByte);
        byte decByte = --incByte;
        System.out.println("Значение byte после декремента: " + decByte);
        short maxShort  = 32767;
        System.out.println("Максимальное значение short: " + maxShort);
        short incShort = ++maxShort;
        System.out.println("Значение short после инкремента: " + incShort);
        short decShort = --incShort;
        System.out.println("Значение short после декремента: " + decShort);
        int maxInt = 2147483647;
        System.out.println("Максимальное значение int: " + maxInt);
        int incInt = ++maxInt;
        System.out.println("Значение int после инкремента: " + incInt);
        int decInt = --incInt;
        System.out.println("Значение int после декремента: " + decInt);
        long maxLong  = 9223372036854775807L;
        System.out.println("Максимальное значение long: " + maxLong);
        long incLong = ++maxLong;
        System.out.println("Значение long после инкремента: " + incLong);
        long decLong = --incLong;
        System.out.println("Значение long после декремента: " + decLong);
        System.out.println("\n5. Перестановка значений переменных");





    }
}
