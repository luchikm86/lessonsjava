package Lessons;

import java.util.Scanner;

/**
 * Created by Лучики on 23.04.2021.
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("input 5");
//        int value = scanner.nextInt();
//        while (value!=5){
//            System.out.println("input 5");
//            value = scanner.nextInt();
//        }
//        System.out.println("You input 5");

        /** отличие while и do while
         * while - сначала поверить условие в (), а потом выполнит действие.
         *do while - выполнит действие как минимум один раз, а потом проверить условие и по итогу или закончит или дальше будет проверять условие.
         */

        int value1;
        do {
            System.out.println("input 5");
            value1 = scanner.nextInt();
        } while (value1!=5);

        System.out.println("You input 5");




    }
}
