package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //пустой целочисленный массив
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];   //классы пишутся с большой буквы
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println();
        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings) {   //String string - тип данных строка, strings - имя массива который хотим перебрать
            System.out.println(string);
        }
        int[] numb = {1,2,3};
        int sum = 0;
        for (int x:numb) {
            sum=sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s;   //по умолчанию null.

    }
}
