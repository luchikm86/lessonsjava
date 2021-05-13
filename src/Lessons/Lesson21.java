package Lessons;

/**
 * Created by Лучики on 04.05.2021.
 */
public class Lesson21 {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Pol", 30);
        h1.printNumberOfPeople();
        Human2 h2 = new Human2("Bob", 24);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human2 h3= new Human2("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}

class Human2{
    private String name;
    private int age;
    public static int countPeople; // по умолчанию countPeople равен 0

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople(){
        System.out.println("Number of peple is "+countPeople);
    }
}
