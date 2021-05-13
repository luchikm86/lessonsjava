package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {          //i++ == i=i+1 (true)
            System.out.println("Hello " +i);
        }

        for(int i=0; i<=10; i=i+5) {          //i++ == i=i+1 (true)
            System.out.println("Hello 2 " +i);
        }

        for(int i=10; i>=0; i=i-5) {          //i++ == i=i+1 (true)
            System.out.println("Hello 3 " +i);
        }
    }
}
