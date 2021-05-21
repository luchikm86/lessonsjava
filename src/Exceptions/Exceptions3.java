package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Лучики on 21.05.2021.
 */
public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception (Compile time exception) = исключительные случаи в работе программы - нужно обрабатывать исключения

        File file = new File("TestFile");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("asdf");
        }

        //Unchecked Exception (Runtime exception) = ошибка в работе программы - обрабатывать его не нужно

        // int a = 1 / 0;  //среда разработки ошибку не показывает, но покажет предупреждение. После запуска появится уже ошибка

        // String name = null;
        // name.length();

         int[] arr = new int[2]; // Впринципе пожно обработать RuntimeException через try catch, но лучше не обрабатывать
                                // а избавлятся от этого
         System.out.println(arr[2]); //вышли за пределы масива


    }
}
