package Lessons;

/**
 * Created by Лучики on 07.05.2021.
 */
public class Animal {
    String name = "some animal";
    private int id;

    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }

    public  void eat(){
        System.out.println("Animal am eating");
    }

    public  void sleep(){
        System.out.println("Animal am sleeping");
    }

}
