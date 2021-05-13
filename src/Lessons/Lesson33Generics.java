package Lessons;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лучики on 13.05.2021.
 */
public class Lesson33Generics {
    public static void main(String[] args) {
        ///////////////// Java 5 ///////////////////
        List animals = new ArrayList(); // можем лодить все что угодно
        animals.add("cat");     // 0
        animals.add("dog");     // 1
        animals.add("forg");    // 2

        String animal = (String) animals.get(1);
        System.out.println(animal);

        //////////////// С появлением дженеиков //////////////
        List<String> animals2 = new ArrayList<String>(); // модем ложить только String
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);

        //////////////////// Java 7 ///////////////////////
        List<String> animals3 = new ArrayList<>();  // можно указывать тип данных в листе только слева

    }
}
