package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
//        System.out.println("1. ������� ���������� �� ���� Java");
//        if (age > 20) {
//            System.out.println("�������� �������� �� ��������");
//        } else {
//            System.out.println("�� ��������");
//        }
//        if (!men) {
//            System.out.println("women");
//        } else {
//            System.out.println("men");
//        }
//        if (height < 1.80) {
//            System.out.println("���� ���� 180");
//        }
//        else{
//            System.out.println("�������� �������� �� �����");
//        }
//
//        firstLetterName = "Name".charAt(0);
//        if (firstLetterName == 'M') {
//            System.out.println("Maxim");
//        } else if (firstLetterName == 'I') {
//            System.out.println("Ivan");
//        } else {
//            System.out.println("Oleg");
//        }
//
//        System.out.println("\n2. ����� max � min �����");
//        int num1 = 5, num2 = 5;
//        if (num2 > num1) {
//            System.out.println("����� max = " + num2 + "; ����� min = " + num1);
//        } else if (num1 > num2) {
//            System.out.println("����� max = " + num1 + "; ����� min = " + num2);
//        } else {
//            System.out.println("����� �����");
//        }
//
//        System.out.println("\n3. ������ � ������");
//        int num3 = 57;
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
//
//        System.out.println("\n4. ����� ���������� ���� � ������");
//        int num4 = 123, num5 = 123;
//        int digit1Num4 = num4 / 100;
//        int digit1Num5 = num5 / 100;
//        int digit2Num4 = num4 % 100 / 10;
//        int digit2Num5 = num5 % 100 / 10;
//        int digit3Num4 = num4 % 10;
//        int digit3Num5 = num5 % 10;
//        System.out.print("� ����� " + num4 + " � " + num5 + " ���������� ����� ");
//        if (digit1Num4 != digit1Num5 && digit2Num4 != digit2Num5 && digit3Num4 != digit2Num5)
//            System.out.println("� ��������������� �������� �����������");
//        else {
//            if (digit1Num4 == digit1Num5)
//                System.out.print(digit1Num4 + " � " + digit1Num5 + " � ������� 3, ");
//            if (digit2Num4 == digit2Num5)
//                System.out.println(digit2Num4 + " � " + digit2Num5 + " � ������� 2, ");
//            if (digit3Num4 == digit3Num5)
//                System.out.println(digit3Num4 + " � " + digit3Num5 + " � ������� 1");
//        }
//
//        System.out.println("\n5. ����������� �����, ����� ��� ������� �� �� ����");
//        char ch = '\u0057';
//        if (ch > 64 & ch < 91) {
//            System.out.println(ch + " ����� �������");
//        } else if (ch > 96 & ch < 123) {
//            System.out.println(ch + " ����� ���������");
//        } else if (ch > 47 & ch < 58) {
//            System.out.println(ch + " �����");
//        } else {
//            System.out.println(ch + " �� ����� � �� �����");
//        }
//
//        System.out.println("\n6. ����������� ����� ������ � ����������� ������ %");
//        int num6 = 300000;
//        int procent;
//        if (num6 < 100000) {
//            procent = 5;
//        } else if (num6 >= 100000 & num6 <= 300000) {
//            procent = 7;
//        } else {
//            procent = 10;
//        }
//        double sumProcent = num6 / 100 * procent;
//        System.out.println("����� ������ = " + num6 + "\n����������� % = " + sumProcent +
//                "\n�������� ����� � % = " + (num6 + sumProcent));
//
//        System.out.println("\n7. ����������� ������ �� ���������");
//        int testscoreHistory = 59;
//        int testscoreProgram = 91;
//        int gradeHistory;
//        int gradeProgram;
//        if (testscoreHistory > 91) {
//            gradeHistory = 5;
//        } else if (testscoreHistory > 73) {
//            gradeHistory = 4;
//        } else if (testscoreHistory > 60) {
//            gradeHistory = 3;
//        } else {
//            gradeHistory = 2;
//        }
//        if (testscoreProgram > 91) {
//            gradeProgram = 5;
//        } else if (testscoreProgram > 73) {
//            gradeProgram = 4;
//        } else if (testscoreProgram > 60) {
//            gradeProgram = 3;
//        } else {
//            gradeProgram = 2;
//        }
//        int averageGrade = (gradeHistory + gradeProgram) / 2;
//        int averageScore = (testscoreHistory + testscoreProgram) / 2;
//        System.out.println(gradeHistory + " - �������");
//        System.out.println(gradeProgram + " - ����������������");
//        System.out.println("������� ��� ������ - " + averageGrade);
//        System.out.println("������� % - " + averageScore);
//
//        System.out.println("\n8. ������ �������");
//        int rent = 5000;
//        int sale = 13000;
//        int costPrice = 9000;
//        int profit = (sale - costPrice - rent) * 12;
//        if (profit > 0) {
//            System.out.println("������� �� ���: + " + profit);
//        } else {
//            System.out.println("������� �� ���: " + profit);
//        }

        System.out.println("\n9. ������� ���������� �������");
        int sum = 567;
        int a1 = 10;
        int a2 = 5;
        int a3 = 50;
        int b1 = sum / 100;
        int b2 = sum % 100 / 10;
        int b3 = sum % 10;
        int c1 , c2 , c3;

        if (a1 >= b1) {
            c1 = b1;
        } else {
            c1 = a1;
        }
//            c2 = (b1 - c1) * 10;
        if (a2 >= b2) {
                c2 = b2;
        } else {
            c2 = a2;
        }
//        c3 = (b2 - c2) * 10;
        if (a3 >= b3) {
            c3 = b3;
        } else {
            c3 = a3;
        }


                System.out.println("������� ��������� 100 - " + c1);
                System.out.println("������� ��������� 10 - " + c2);
                System.out.println("������� ��������� 1 - " + c3);
                System.out.println("�������� ����� - " + (c1 * 100 + c2 * 10 + c3 * 1));

    }



}





