package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "Рома";
        person1.setName("Рома", 50);
        person1.speak();
        Person person2 = new Person();
        String s1 = "Вова";
        int a1 = 20;
        person2.setName(s1, a1);
        person2.sayHello();
        System.out.println();
        person2.speakFor();
        int year1 = person1.calculateYearaToRetirement();
        int year2 = person2.calculateYearaToRetirement();
        System.out.println("Первому человеку до пенсии " + year1 + " лет.");
        System.out.println("Второму человеку до пенсии " + year2 + " лет.");
    }
}

class Person{
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершить (методы)

    String name;
    int age;

    void setName(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearaToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age +" лет");
    }

    void speakFor(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
