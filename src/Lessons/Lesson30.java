package Lessons;

/**
 * Created by Лучики on 11.05.2021.
 */
public class Lesson30 {
    public static void main(String[] args) {
        float f = 123.2f;
        float f1 = (float)123.2;  //double сконвертировался во float

        //конвертирование инт в лонг
        long l = 1232212121212213232L;  //ставить лучше большую букву 'L', тк маленькая 'l' похожа на цифру один
        int a = 123;
        long b = a; //любое число которое поместится в инт, может поместится лонг, а наоборот нельзя, тк лонг больше инта

        //конвертирование лонг в инт
//    int x = l; // нельзя так сконвертировать
        int x = (int)b; //так можно сконвертировать
        System.out.println(x);
        /**
         * приведение
         * long b = a   -   неявное
         * int x = (int)l;  -   явное
         */

        int i = 123;
        double d = i;
        System.out.println(d);
        double c = 123.5;
//        int e = c;  // так нельзя сконвертировать неявно
        int e = (int)c; // обрежет и выведет все до точки
        System.out.println(e);

        //чтобы округлить
        long l1 = Math.round(c);
        System.out.println(l1);


        byte b1 = (byte)128; //-128 до 127
        System.out.println(b1);
        byte b2 = (byte)129; //-128 до 127
        System.out.println(b2);
    }

}
