package Lession1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
//        System.out.println("1. ������� ���������� �� ���� Java");

//        if (age > 20) {
//            System.out.println("�������� �������� �� ��������");
//        } else {
//            System.out.println("�� ��������");
//        }
//
//        if (!men) {
//            System.out.println("women");
//        } else {
//            System.out.println("men");
//        }
//
//        if (height < 1.80) {
//            System.out.println("���� ���� 180");
//        } else {
//            System.out.println("�������� �������� �� �����");
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
//        System.out.println("\n2. ����� max � min �����");
//        int num1 = 5, num2 = 5;
//        if(num2 > num1) {
//            System.out.println("����� max = " + num2 + "; ����� min = " + num1);
//        }
//        else if(num1 > num2) {
//            System.out.println("����� max = " + num1 + "; ����� min = " + num2);
//        }
//        else{
//            System.out.println("����� �����");
//        }
//        System.out.println("\n3. ������ � ������");
//        int num3 = 0;
//        if (num3 != 0) {
//            if (num3 % 2 == 0)
//                System.out.print("����� " + num3 + " - ������");
//            else
//                System.out.print("����� " + num3 + " - ��������");
//            if (num3 < 0)
//                System.out.print(", �������������");
//            else
//                System.out.println(", �������������");
//        } else System.out.print("����� ����� 0");
//        System.out.println("\n4. ����� ���������� ���� � ������");
//        int a = 123, b = 124;
//        int a1 = a / 100;
//        int b1 = b / 100;
//        int a2 = a % 100 / 10;
//        int b2 = b % 100 / 10;
//        int a3 = a % 10;
//        int b3 = b % 10;
//        System.out.print("� ����� " + a + " � " + b + " ���������� ����� ");
//        if (a1 == b1)
//            System.out.print(a1 + " � " + b1 + " � ������� �����, ");
//        if (a2 == b2)
//            System.out.println(a2 + " � " + b2 + " � ������� ��������, ");
//        if (a3 == b3)
//            System.out.println(a3 + " � " + b3 + " � ������� ������");
//        else System.out.println("� ��������������� �������� �����������");
        System.out.println("\n5. ����������� �����, ����� ��� ������� �� �� ����");
        char ch = '\u0057';
        if (Character.isDigit(ch))
            System.out.println(ch + " �����");
        else if (Character.isUpperCase(ch))
            System.out.println(ch + " ����� �������");
        else if (Character.isLowerCase(ch))
            System.out.println(ch + " ����� ���������");
        else
            System.out.println(ch + " �� ����� � �� �����");
    }
}






