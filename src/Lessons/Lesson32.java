package Lessons;


/**
 * Created by Лучики on 13.05.2021.
 */
public class Lesson32 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Upcasting - Восходящее преобразование
        Animal animal = new Dog();  //класс Dog наследуется от класса Animal, и по наследованию он стоит ниже Animal
        Animal animal1 = dog;   //можно так сделать

        // Downcasting - Нисходящее преобразование
        Dog dog1 = (Dog) animal;
        dog1.bark();
    }
}
