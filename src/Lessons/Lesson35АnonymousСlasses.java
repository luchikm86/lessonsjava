package Lessons;

/**
 * Created by Лучики on 13.05.2021.
 */

interface AbleToEat {
    public void eat();
}

public class Lesson35АnonymousСlasses {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }

}
