package Lessons;

/**
 * Created by Лучики on 07.05.2021.
 */
public class Dog extends Animal {
    @Override   //переопределение метод
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("I am bark");
    }
    public void showName(){
        System.out.println(name);
    }


}
