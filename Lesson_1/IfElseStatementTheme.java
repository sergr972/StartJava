package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 25;
        if (age > 20) {
            System.out.println("кандидат подходит по возрасту");
        } else {
            System.out.println("не подходит");
        }

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("women");
        } else {
            System.out.println("men");
        }
        double height = 1.85;
        if (height < 1.80) {
            System.out.println("рост ниже 180");
        } else {
            System.out.println("кандидат подходит по росту");
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

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 5, num2 = 5;
        if (num2 > num1) {
            System.out.println("число max = " + num2 + "; число min = " + num1);
        } else if (num1 > num2) {
            System.out.println("число max = " + num1 + "; число min = " + num2);
        } else {
            System.out.println("числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 57;
        if (num3 != 0) {
            if (num3 % 2 == 0)
                System.out.print("число " + num3 + " - четное");
            else
                System.out.print("число " + num3 + " - нечетное");
            if (num3 < 0)
                System.out.print(", отрицательное");
            else
                System.out.println(", положительное");
        } else System.out.print("число равно 0");

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 123, num5 = 123;
        int hundredNum4 = num4 / 100;
        int hundredNum5 = num5 / 100;
        int tenNum4 = num4 % 100 / 10;
        int tenNum5 = num5 % 100 / 10;
        int onceNum4 = num4 % 10;
        int onceNum5 = num5 % 10;
        System.out.print("У чисел " + num4 + " и " + num5 + " одинаковые цифры ");
        if (hundredNum4 != hundredNum5 && tenNum4 != tenNum5 && onceNum4 != tenNum5)
            System.out.println("в соответствующих разрядах отсутствуют");
        else {
            if (hundredNum4 == hundredNum5)
                System.out.println("\n" + hundredNum4 + " в разряде 3, ");
            if (tenNum4 == tenNum5)
                System.out.println(tenNum4 + " в разряде 2, ");
            if (onceNum4 == onceNum5)
                System.out.println(onceNum4 + " в разряде 1");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch = 'W';
        if (ch > 64 & ch < 91) {
            System.out.println(ch + " - большая буква");
        } else if (ch > 96 & ch < 123) {
            System.out.println(ch + " - маленькая буква");
        } else if (ch > 47 & ch < 58) {
            System.out.println(ch + " - число");
        } else {
            System.out.println(ch + " - не число и не буква");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
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
        System.out.println("Сумма вклада = " + deposit + "\nНачисленный % = " + sumProcent +
                "\nИтоговая сумма с % = " + (deposit + sumProcent));

        System.out.println("\n7. Определение оценки по предметам");
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
        System.out.println(gradeHistory + " - история");
        System.out.println(gradeProgramming + " - программирование");
        System.out.println("средний бал оценок - " + averageGrade);
        System.out.println("средний % - " + averageScore);

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int sale = 13000;
        int costPrice = 9000;
        int profit = (sale - costPrice - rent) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: + " + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int cashOut = 567;
        int dollars100 = 100;
        int dollars10 = 10;
        int number100Dollars = 10;
        int number10Dollars = 5;
        int number1Dollars = 50;
        int count100Dolars , count10Dollars , countDollars;
        if (cashOut > number100Dollars * dollars100 + number10Dollars * dollars10 + number1Dollars) {
            System.out.println("банкнот не хватает");
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
                System.out.println("банкнот номиналом 100 - " + count100Dolars);
                System.out.println("банкнот номиналом 10 - " + count10Dollars);
                System.out.println("банкнот номиналом 1 - " + countDollars);
                System.out.println("исходная сумма - " + (count100Dolars * dollars100 + count10Dollars * dollars10 + countDollars));
            } else {
                System.out.println("банкнот не хватает");
            }
        }
    }
}





