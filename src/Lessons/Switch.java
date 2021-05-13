package Lessons;

import java.util.Scanner;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Switch {
    public static void main(String[] args) {

        /**
        *Switch используется когда есть много условий и их все нужно перебрать
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if (age==10){
            System.out.println("ты учишься в школе");
        } else if (age==18){
            System.out.println("ты закончил школу");
        } else {
            System.out.println("ни одно из предыдущих условий не подошло");
        }
                // else if ... и так далеее. таких условий может біть очень много
        System.out.println("________________");

        switch (age){
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");
        }       // можно пивать default, аможно не писать

//        String ageStr = scanner.nextLine();
//        switch (ageStr){
//            case "ноль":
//                System.out.println("ты родился");
//                break;
//            case "семь":
//                System.out.println("ты пошел в школу");
//                break;
//            case "восемнадцать":
//                System.out.println("ты закончил школу");
//                break;
//            default:
//                System.out.println("ни одно из предыдущих условий не подошло");
//        }         //можно также строки проверять

    }
}
