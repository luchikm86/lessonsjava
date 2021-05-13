package Interfaces;

/**
 * Created by Лучики on 11.05.2021.
 */
public class Animal implements Info{    // Класс может имлементировать много интерфейсов через запятую,
    public int id;                      // но наследоваться только от одного класа

    public Animal(int id){
        this.id=id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void showInfo(){
        System.out.println("Id is "+this.id);
    }
}
