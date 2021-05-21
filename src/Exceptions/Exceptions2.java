package Exceptions;

import java.util.Scanner;

/**
 * Created by Лучики on 21.05.2021.
 */
public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                throw new ScannerException("Пользователь ввел что-то кроме нуля");    // обработка через throws только свой Exception
            }

            /*  // обработка через throws IOException
            if (x != 0){
                throw new IOException();    // обработка через throws IOException
            }
            */

            /*  // обработка через throws  try catch
            if (x != 0){
            try {
                throw new IOException();    // нужно обработать чере throws IOException или try catch
            } catch (IOException e) {
                System.out.println("Пользователь ввел что-то кроме нуля");
            }
             */
        }
    }
}
