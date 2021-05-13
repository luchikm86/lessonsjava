import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Лучики on 13.05.2021.
 */
public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "E:\\IT\\Java\\test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        System.out.println("-----------------");

        String path2 = "E:\\IT\\Java\\test2.txt";
        File file2 = new File(path2);

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] words = line.split(" "); //у нас в документе между цифрами пробел и в скобках ставим пробел. ращделит строку по пробелам
        // если поставить точку между словами, то ставим "//."
        System.out.println(Arrays.toString(words));


        System.out.println("-----------------");
//        /*если в документе цифры и нужно потом строку переобразовать в число*/
        String path3 = "E:\\IT\\Java\\test3.txt";
        File file3 = new File(path3);

        Scanner scanner3 = new Scanner(file3);
        String line3 = scanner3.nextLine();
        String[] numbersString = line3.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
          numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------");

        //создали файл в конре проекта. файлы читает с корня папки проекта
        File file4 = new File("TestFile");

        Scanner scanner4 = new Scanner(file4);
        String line4 = scanner4.nextLine();
        String[] numbersString4 = line4.split(" ");
        int[] numbers4 = new int[3];
        int counter4 = 0;

        for(String number : numbersString4) {
            numbers4[counter4++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers4));


        scanner.close();    //нужно закрывать поток

    }

}
