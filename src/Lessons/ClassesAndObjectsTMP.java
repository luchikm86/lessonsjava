package Lessons;

/**
 * Created by Лучики on 04.05.2021.
 */
public class ClassesAndObjectsTMP {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("Какое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе " + person1.getName());
        System.out.println("Выводим значение в main методе " + person1.getAge());
        System.out.println();
        person1.setName("");
        person1.setAge(-22);
    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetriment(){
        int years = 65 - age;
        return years;
    }


}
