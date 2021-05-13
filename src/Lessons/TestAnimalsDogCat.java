package Lessons;

import Lessons.Animal;
import Lessons.Cat;
import Lessons.Dog;

/**
 * Created by Лучики on 11.05.2021.
 */
public class TestAnimalsDogCat {
    public static void main(String[] args) {
        Animal animal = new Animal();   //собака как животное
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

//        animal.eat();
//        dog.eat();
        System.out.println();
        Animal animal1 = new Dog(); //собака как собака
        animal1.eat();
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
