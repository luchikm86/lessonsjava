package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Лучики on 21.05.2021.
 */
public class Exceptions4 {
    public static void main(String[] args) {
        /*
        FileNotFoundException, IllegalArgumentException наследуются от IOException
        и поэтому достаточно будет throws IOException или в try catch IOException
         */

//        run();      //throws IOException, ParseException


//        try {
//            run();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        //multi catch
//        try {
//            run();
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }





    }

    public static void run() throws IOException, ParseException, FileNotFoundException, IllegalArgumentException {

        /*
        если в методе могут появится несколько исключений которые нужно обработать, то
        их все нужно добавить для обработки. Их может быть любое колличество
         */
    }
}
