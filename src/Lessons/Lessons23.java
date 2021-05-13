package Lessons;

/**
 * Created by Лучики on 04.05.2021.
 */
public class Lessons23 {
    public static void main(String[] args) {
        String x = "hello";
        x = x.toUpperCase();// переопределили x
        System.out.println(x);

        // ----------------------------------------

        String string1 = "Hello";
        String string2 = "my";
        String string3 = "friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);

        // ----------------------------------------

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend").append(" !"); //можно добавлять в строке
        System.out.println(sb.toString());

    }
}
