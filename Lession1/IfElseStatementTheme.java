package Lession1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

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
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 5, num2 = 5;
        if(num2 > num1) {
            System.out.println("число max = " + num2 + "; число min = " + num1);
        }
        else if(num1 > num2) {
            System.out.println("число max = " + num1 + "; число min = " + num2);
        }
        else{
            System.out.println("числа равны");
        }
        System.out.println("\n3. Работа с числом");
        int num3 = 10;
        if(num3 != 0) {
            if(num3 % 2 == 0) {
                if(num3 < 0) System.out.print("число " + num3 + " отрицательное, нечетное");
                }
                else System.out.print("число " + num3 + " положительное , нечетное");

            }
                else System.out.print("число " + num3 + " отрицательное, четное");
            }
//            else System.out.print("число равно 0");
        }





