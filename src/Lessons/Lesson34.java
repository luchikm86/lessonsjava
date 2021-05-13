package Lessons;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лучики on 13.05.2021.
 */
public class Lesson34 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list){ // если вместо Animal поставить ? - означает что можно передать любой лист(обьект)
        for (Animal animal:list) {                          //extends или super(или клас енимал или выше) все что наследуются от Animal
            animal.eat();
        }
    }
    /*
        Object
        Animal
          Dog
     */
}
