package Lesson_2;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex("щенок");
        wolf.setAge(3);
        wolf.setWeight(12.5);
        wolf.setName("Вольф");
        wolf.setColor("серый");
        System.out.println("Волк по имени " + wolf.getName() + ".\nЭто " +  wolf.getSex() +
                ", его возраст - " + wolf.getAge() + ", вес - " + wolf.getWeight() +
                ", окрас - " + wolf.getColor() + ".");
        System.out.println(wolf.getName() + " умеет:");
        wolf.run();
        wolf.hunt();
        wolf.howl();
        wolf.sit();
        wolf.walk();
    }
}
