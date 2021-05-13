package Interfaces;

/**
 * Created by Лучики on 11.05.2021.
 */
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        System.out.println("______________________________");
        animal1.showInfo();
        person1.showInfo();
        System.out.println("______________________________");
        Info info1 = new Animal(2);     // это полиморфизм
        Info info2 = new Person("Pol");
        info1.showInfo();
        info2.showInfo();
        System.out.println("______________________________");
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal1);
        outputInfo(person1);

    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
