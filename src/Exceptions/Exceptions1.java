package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Лучики on 21.05.2021.
 */
public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("asd");
        try {                                           // обработка исключение через try catch
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();    // стандартное исключение
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");

//        readFile();
                        /*таким способом readFile(); нужно обработать исклбчением в класе где вызывают метод
                            добавить throws FileNotFoundException или try catch*/

    }

    public static void readFile () throws FileNotFoundException {  // обработка исключение через ексепшин
        File file = new File("TestFile");
        Scanner scanner = new Scanner(file);
    }
}
