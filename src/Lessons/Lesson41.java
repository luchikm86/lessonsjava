package Lessons;

/**
 * Created by Лучики on 21.05.2021.
 */
public class Lesson41 {         //lesson abstracts classes
    public static void main(String[] args) {
        CatNew cat = new CatNew();
        DogNew dog = new DogNew();
        dog.makeSound();
        cat.makeSound();
        dog.eat();
        cat.eat();
    }
}
