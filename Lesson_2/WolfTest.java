package Lesson_2;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 3;
        wolf.name = "Вольф";
        wolf.color = "серый";

        System.out.println("Волк по имени " + wolf.name + ", + возраст - " + wolf.age + ", цвет - " + wolf.color);

        wolf.run();
        wolf.hunt();

    }
}
