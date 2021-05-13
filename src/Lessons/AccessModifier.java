package Lessons;

/**
 * Created by Лучики on 11.05.2021.
 */
public class AccessModifier {
    public  int a;
    private int b;
    int c;
    protected int d;
    public final static String CONSTANT = "CONSTANT";


    public static void main(String[] args) {
        /**
         * public, private, default(все что default доступно в перделах этого пакета), protected(доступны в
         * передалх одного пакета, доспуны всем подкласам, даже если эти подкласы вне пакета)
         */

        /**
         * В одном джава класе должне быть хоть один(не больше) публичный класс
         * Клас может быть public или default
         */

        /**
         * Поля в класе должны быть всегда private
         * public поля делают только константы
         */


    }
}
