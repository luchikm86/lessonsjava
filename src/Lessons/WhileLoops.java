package Lessons;

/**
 * Created by Лучики on 22.04.2021.
 */
public class WhileLoops {
    public static void main(String[] args) {
        boolean b = true;
        boolean b1 = 5>2;
        boolean b2 = 5<2;
        boolean b3 = 5>=5;
        boolean b4 = 5>5;
        boolean b5 = 5==5;

        int value1 = 0;
        boolean t = value1 > 5;

        int value = 0;
        while (value<5){        //while выполняется пока значение в круглых скобках true
            System.out.println("Hello " + value);
            value = value+1;
        }

//        System.out.println(b);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);
//        System.out.println(t);
    }
}
