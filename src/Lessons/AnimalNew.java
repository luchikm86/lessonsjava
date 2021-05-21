package Lessons;

/**
 * Created by Лучики on 21.05.2021.
 */
public abstract class AnimalNew {           //если abstract - нельзя создать обьект этого класса
    public abstract void makeSound();
    public  void eat(){
        System.out.println("Animal eating");
    }
}
