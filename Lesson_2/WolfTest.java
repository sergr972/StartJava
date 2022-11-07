package Lesson_2;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "щенок";
        wolf.age = 3;
        wolf.weight = 12.5;
        wolf.name = "Вольф";
        wolf.color = "серый";
        System.out.println("Волк по имени " + wolf.name + ".\nЭто " +  wolf.sex +
                ", его возраст - " + wolf.age + ", вес - " + wolf.weight +
                ", окрас - " + wolf.color + ".");
        System.out.println(wolf.name + " умеет:");
        wolf.run();
        wolf.hunt();
        wolf.howl();
        wolf.sit();
        wolf.walk();
    }
}
