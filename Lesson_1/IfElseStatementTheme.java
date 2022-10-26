package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ������� ���������� �� ���� Java");
        int age = 25;
        if (age > 20) {
            System.out.println("�������� �������� �� ��������");
        } else {
            System.out.println("�� ��������");
        }

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("women");
        } else {
            System.out.println("men");
        }
        double height = 1.85;
        if (height < 1.80) {
            System.out.println("���� ���� 180");
        } else {
            System.out.println("�������� �������� �� �����");
        }
        String name = "Ivan";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Maxim");
        } else if (firstLetterName == 'I') {
            System.out.println("Ivan");
        } else {
            System.out.println("Oleg");
        }

        System.out.println("\n2. ����� max � min �����");
        int num1 = 5, num2 = 5;
        if (num2 > num1) {
            System.out.println("����� max = " + num2 + "; ����� min = " + num1);
        } else if (num1 > num2) {
            System.out.println("����� max = " + num1 + "; ����� min = " + num2);
        } else {
            System.out.println("����� �����");
        }

        System.out.println("\n3. ������ � ������");
        int num3 = 57;
        if (num3 != 0) {
            if (num3 % 2 == 0)
                System.out.print("����� " + num3 + " - ������");
            else
                System.out.print("����� " + num3 + " - ��������");
            if (num3 < 0)
                System.out.print(", �������������");
            else
                System.out.println(", �������������");
        } else System.out.print("����� ����� 0");

        System.out.println("\n4. ����� ���������� ���� � ������");
        int num4 = 123, num5 = 123;
        int hundredNum4 = num4 / 100;
        int hundredNum5 = num5 / 100;
        int tenNum4 = num4 % 100 / 10;
        int tenNum5 = num5 % 100 / 10;
        int onceNum4 = num4 % 10;
        int onceNum5 = num5 % 10;
        System.out.print("� ����� " + num4 + " � " + num5 + " ���������� ����� ");
        if (hundredNum4 != hundredNum5 && tenNum4 != tenNum5 && onceNum4 != tenNum5)
            System.out.println("� ��������������� �������� �����������");
        else {
            if (hundredNum4 == hundredNum5)
                System.out.println("\n" + hundredNum4 + " � ������� 3, ");
            if (tenNum4 == tenNum5)
                System.out.println(tenNum4 + " � ������� 2, ");
            if (onceNum4 == onceNum5)
                System.out.println(onceNum4 + " � ������� 1");
        }

        System.out.println("\n5. ����������� �����, ����� ��� ������� �� �� ����");
        char ch = 'W';
        if (ch > 64 & ch < 91) {
            System.out.println(ch + " - ������� �����");
        } else if (ch > 96 & ch < 123) {
            System.out.println(ch + " - ��������� �����");
        } else if (ch > 47 & ch < 58) {
            System.out.println(ch + " - �����");
        } else {
            System.out.println(ch + " - �� ����� � �� �����");
        }

        System.out.println("\n6. ����������� ����� ������ � ����������� ������ %");
        int deposit = 300000;
        int percent;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit >= 100000 & deposit <= 300000) {
            percent = 7;
        } else {
            percent = 10;
        }
        double sumProcent = deposit / 100 * percent;
        System.out.println("����� ������ = " + deposit + "\n����������� % = " + sumProcent +
                "\n�������� ����� � % = " + (deposit + sumProcent));

        System.out.println("\n7. ����������� ������ �� ���������");
        int percentHistory = 59;
        int percentProgramming = 91;
        int gradeHistory;
        int gradeProgramming;
        if (percentHistory > 91) {
            gradeHistory = 5;
        } else if (percentHistory > 73) {
            gradeHistory = 4;
        } else if (percentHistory > 60) {
            gradeHistory = 3;
        } else {
            gradeHistory = 2;
        }
        if (percentProgramming > 91) {
            gradeProgramming = 5;
        } else if (percentProgramming > 73) {
            gradeProgramming = 4;
        } else if (percentProgramming > 60) {
            gradeProgramming = 3;
        } else {
            gradeProgramming = 2;
        }
        int averageGrade = (gradeHistory + gradeProgramming) / 2;
        int averageScore = (percentHistory + percentProgramming) / 2;
        System.out.println(gradeHistory + " - �������");
        System.out.println(gradeProgramming + " - ����������������");
        System.out.println("������� ��� ������ - " + averageGrade);
        System.out.println("������� % - " + averageScore);

        System.out.println("\n8. ������ �������");
        int rent = 5000;
        int sale = 13000;
        int costPrice = 9000;
        int profit = (sale - costPrice - rent) * 12;
        if (profit > 0) {
            System.out.println("������� �� ���: + " + profit);
        } else {
            System.out.println("������� �� ���: " + profit);
        }

        System.out.println("\n9. ������� ���������� �������");
        int cashOut = 567;
        int dollars100 = 100;
        int dollars10 = 10;
        int number100Dollars = 10;
        int number10Dollars = 5;
        int number1Dollars = 50;
        int count100Dolars , count10Dollars , countDollars;
        if (cashOut > number100Dollars * dollars100 + number10Dollars * dollars10 + number1Dollars) {
            System.out.println("������� �� �������");
        } else {
            if (number100Dollars >= cashOut / 100) {
                count100Dolars = cashOut / 100;
            } else {
                count100Dolars = number100Dollars;
            }
            int tmp1 = cashOut - count100Dolars * 100;
            int tmp2 = tmp1 / 10;
            if (tmp2 >= number10Dollars) {
                count10Dollars = number10Dollars;
            } else {
                count10Dollars = tmp2;
            }
            tmp1 -= count10Dollars * 10;
            if (number1Dollars >= tmp1) {
                countDollars = tmp1;
                System.out.println("������� ��������� 100 - " + count100Dolars);
                System.out.println("������� ��������� 10 - " + count10Dollars);
                System.out.println("������� ��������� 1 - " + countDollars);
                System.out.println("�������� ����� - " + (count100Dolars * dollars100 + count10Dollars * dollars10 + countDollars));
            } else {
                System.out.println("������� �� �������");
            }
        }
    }
}





