package Lesson_2;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark5");
        jaegerOne.setHeight(76.2f);
        jaegerOne.setWeight(1.85f);
        jaegerOne.move();
        jaegerOne.scanKaiju();

        Jaeger jaegerTwo = new Jaeger("Bracer Phoenix", "Mark-5", 70.91f, 2.128f);

        System.out.println("Имя робота - " + jaegerOne.modelName + "\nсерия - " + jaegerOne.mark +
                "\nвысота - " + jaegerOne.height + "\nвес -" + jaegerOne.weight);
        jaegerOne.move();
        jaegerOne.scanKaiju();

        System.out.println("\nИмя робота - " + jaegerTwo.modelName+ "\nсерия - " + jaegerTwo.mark +
                "\nвысота - " + jaegerTwo.height + "\nвес -" + jaegerTwo.weight);
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerOne.setModelName("Striker");
        jaegerOne.setMark("Mark-6");
        jaegerTwo = new Jaeger("Phoenix", "Mark-6", 70.91f, 2.128f);
        System.out.println("\nИмя робота - " + jaegerOne.modelName + "\nсерия - " + jaegerOne.mark +
                "\nвысота - " + jaegerOne.height + "\nвес -" + jaegerOne.weight);
        System.out.println("\nИмя робота - " + jaegerTwo.modelName+ "\nсерия - " + jaegerTwo.mark +
                "\nвысота - " + jaegerTwo.height + "\nвес -" + jaegerTwo.weight);
    }
}
