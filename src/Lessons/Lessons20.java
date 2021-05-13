package Lessons;

/**
 * Created by Лучики on 04.05.2021.
 */
public class Lessons20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        Human1 human2 = new Human1("Bob");
        Human1 human3 = new Human1("Pol", 24);
        Human1 h1 = new Human1("Bob", 40);

    }
}

class Human1{
    private String name;
    private int age;

    public Human1(){
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println(name+", "+age);
    }

    public Human1(String name){
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }

    public Human1(String name, int age){
        System.out.println("Привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
