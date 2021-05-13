package Lessons;

/**
 * Created by Лучики on 07.05.2021.
 */
public class Lesson24 {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);
        Human24 h1 = new Human24("Bob", 40);
        System.out.println(h1);
    }
}

class Human24{
    private String name;
    private int age;

    public Human24(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name+", "+age;
    }

}