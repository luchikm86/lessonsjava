package Lessons;

import java.util.Scanner;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Input {
    public static void main(String[] args) {
        String str = new String("qwerty"); // можно так, но сучше проще String string = "qwerty";

        Scanner s = new Scanner(System.in);
        System.out.println("input any");
        String string = s.nextLine();
        System.out.println("you input "+string);

        System.out.println("input int");
        int x =s.nextInt();
        System.out.println("you input "+x);
    }

}
