package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class If {
    public static void main(String[] args) {
        if (5==5) {
            System.out.println("да, верно.");
        }

        if (1>=5) {
            System.out.println("да, верно.");
        } else{
            System.out.println("нет, не вреною");
        }

        System.out.println("____________________");

        int myInt = 5;
        if (myInt<10){
            System.out.println("Yes");
        } else if (myInt>20){
            System.out.println("No");
        }


    }
}
