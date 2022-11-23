package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark5");
        jaegerOne.setHeight(76.2f);
        jaegerOne.setWeight(1.85f);

        Jaeger jaegerTwo = new Jaeger("Bracer Phoenix", "Mark-5", 70.91f, 2.128f);

        System.out.println("Имя робота - " + jaegerOne.getModelName() + "\nсерия - " + jaegerOne.getMark() +
                "\nвысота - " + jaegerOne.getHeight() + "\nвес -" + jaegerOne.getWeight());
        jaegerOne.move();
        jaegerOne.scanKaiju();

        System.out.println("\nИмя робота - " + jaegerTwo.getModelName()+ "\nсерия - " + jaegerTwo.getMark() +
                "\nвысота - " + jaegerTwo.getHeight() + "\nвес -" + jaegerTwo.getWeight());
        jaegerTwo.move();
        jaegerTwo.scanKaiju();

        jaegerOne.setModelName("Striker");
        jaegerOne.setMark("Mark-6");

        jaegerTwo = new Jaeger("Phoenix", "Mark-6", 70.91f, 2.128f);
        System.out.println("\nИмя робота - " + jaegerOne.getModelName() + "\nсерия - " + jaegerOne.getMark() +
                "\nвысота - " + jaegerOne.getHeight() + "\nвес -" + jaegerOne.getWeight());
        System.out.println("\nИмя робота - " + jaegerTwo.getModelName()+ "\nсерия - " + jaegerTwo.getMark() +
                "\nвысота - " + jaegerTwo.getHeight() + "\nвес -" + jaegerTwo.getWeight());
    }
}
