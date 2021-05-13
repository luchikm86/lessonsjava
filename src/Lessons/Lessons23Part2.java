package Lessons;

/**
 * Created by Лучики on 04.05.2021.
 */
public class Lessons23Part2 {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s", "Hello");
        System.out.println();
        System.out.printf("This is a string, %d", 23);
        System.out.println();
        System.out.printf("%f This is %s a string, %d", 10.4, "Hello", 1000);
        System.out.println();
        System.out.printf("String %10d \n", 532); // ширина строки после String+пробел если есть.
        System.out.printf("String %10d \n", 5); // \n - перенос строки
        System.out.printf("String %10d \n", 10000); //10 числа форматируются по левой стороне
        System.out.printf("String %10d \n", 1000000000);
        System.out.println();
        System.out.printf("String %d \n", 532);
        System.out.printf("String %d \n", 5);
        System.out.printf("String %d \n", 10000);
        System.out.printf("String %d \n", 1000000000);
        System.out.println();
        System.out.printf("String %-10d \n", 532); // -10 числа форматируются по правой стороне
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 10000);
        System.out.printf("String %-10d \n", 1000000000);
        System.out.println();
        System.out.printf("String %.2f \n", 10.34700); // .2 - сколько чисел будет после точки(.), а также округляет числа после точки
        System.out.printf("String %.2f \n", 0.3467696);
        System.out.printf("String %.2f \n", 435.45);
        System.out.printf("String %.2f \n", 14.34432);
        System.out.printf("String %.2f \n", 34.34);
        System.out.printf("String %.2f \n", 45.337);
        System.out.printf("String %.2f \n", 3.34546758);

    }
}
