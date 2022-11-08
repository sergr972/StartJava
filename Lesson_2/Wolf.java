package Lesson_2;

public class Wolf {

    private String sex;
    private String name;
    private String color;
    private double weight;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        this.age = age;
    }

    public void walk() {
        System.out.println("ходить");
    }

    public void sit() {
        System.out.println("сидеть");
    }

    public void run() {
        System.out.println("бегать");
    }

    public void howl() {
        System.out.println("выть");
    }

    public void hunt() {
        System.out.println("охотиться");
    }
}

