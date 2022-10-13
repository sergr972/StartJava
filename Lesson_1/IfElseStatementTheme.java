package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
//        System.out.println("1. Перевод псевдокода на язык Java");

//        if (age > 20) {
//            System.out.println("кандидат подходит по возрасту");
//        } else {
//            System.out.println("не подходит");
//        }
//
//        if (!men) {
//            System.out.println("women");
//        } else {
//            System.out.println("men");
//        }
//
//        if (height < 1.80) {
//            System.out.println("рост ниже 180");
//        } else {
//            System.out.println("кандидат подходит по росту");
//        }
//
//
//        firstLetterName = "Name".charAt(0);
//        if(firstLetterName == 'M') {
//            System.out.println("Maxim");
//        } else if(firstLetterName == 'I') {
//            System.out.println("Ivan");
//        } else{
//            System.out.println("Oleg");
//        }
//        System.out.println("\n2. Поиск max и min числа");
//        int num1 = 5, num2 = 5;
//        if(num2 > num1) {
//            System.out.println("число max = " + num2 + "; число min = " + num1);
//        }
//        else if(num1 > num2) {
//            System.out.println("число max = " + num1 + "; число min = " + num2);
//        }
//        else{
//            System.out.println("числа равны");
//        }
//        System.out.println("\n3. Работа с числом");
//        int num3 = 0;
//        if (num3 != 0) {
//            if (num3 % 2 == 0)
//                System.out.print("число " + num3 + " - четное");
//            else
//                System.out.print("число " + num3 + " - нечетное");
//            if (num3 < 0)
//                System.out.print(", отрицательное");
//            else
//                System.out.println(", положительное");
//        } else System.out.print("число равно 0");
//        System.out.println("\n4. Поиск одинаковых цифр в числах");
//        int a = 123, b = 124;
//        int a1 = a / 100;
//        int b1 = b / 100;
//        int a2 = a % 100 / 10;
//        int b2 = b % 100 / 10;
//        int a3 = a % 10;
//        int b3 = b % 10;
//        System.out.print("У чисел " + a + " и " + b + " одинаковые цифры ");
//        if (a1 == b1)
//            System.out.print(a1 + " и " + b1 + " в разряде сотен, ");
//        if (a2 == b2)
//            System.out.println(a2 + " и " + b2 + " в разряде десятков, ");
//        if (a3 == b3)
//            System.out.println(a3 + " и " + b3 + " в разряде единиц");
//        else System.out.println("в соответствующих разрядах отсутствуют");
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch = '\u0057';
        if (Character.isDigit(ch))
            System.out.println(ch + " число");
        else if (Character.isUpperCase(ch))
            System.out.println(ch + " буква большая");
        else if (Character.isLowerCase(ch))
            System.out.println(ch + " буква маленькая");
        else
            System.out.println(ch + " не число и не буква");
    }
}






