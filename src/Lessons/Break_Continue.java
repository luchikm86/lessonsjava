package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла.");

        System.out.println("_________________");

        for (int i1 = 0; i1 <= 15; i1++){
            if (i1%2==0){
                continue;
            }
            System.out.println("Это нечетное число "+ i1);
        }

    }
}
