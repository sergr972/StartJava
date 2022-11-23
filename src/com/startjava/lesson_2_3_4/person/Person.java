package com.startjava.lesson_2_3_4.person;

public class Person {

    private String genderMale = "Male";
    private String name = "Ivan";
    private double height = 1.85;
    private byte weight = 80;
    private byte age = 35;

    public void walk() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void talk() {
        System.out.println("Говорит");
    }

    public void learnJava() {
        System.out.println("Учит Java");
    }
}