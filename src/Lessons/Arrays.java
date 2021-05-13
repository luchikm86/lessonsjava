package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Arrays {
    public static void main(String[] args) {
        int numb = 10;        // примитивный тип данных
        char character = 'a';   // примитивный тип данных
        String s = "Hello";     //

        int[] numbers = new int[5]; // ссылочный тип данных
        //создали пустой масив

//        System.out.println(numbers[0]); //0 1 2 3 4
//        System.out.println(numbers[4]);
//        numbers[0] = 10;
//        numbers[1] = 20;
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};   //создаем масив и сразу же иницилизируем его
        for (int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
