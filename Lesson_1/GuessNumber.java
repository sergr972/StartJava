package Lesson_1;

public class GuessNumber {
    public static void main(String[] args) {
        int a = 21; //число игрока
        int b = 10;
        int c = b * 2;
        if (a > 0 & a <= 100){
            if ( a < c) {
                System.out.println("число " + a + " меньщше того, что загадал компьютер");
            } else if (a > c) {
                System.out.println("число " + a + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        }

    }
}
