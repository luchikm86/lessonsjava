package Lessons;

/**
 * Created by Лучики on 23.04.2021.
 */
public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3}; //одномерный массив
        System.out.println(number[1]);

        /**
         * 1,2,3,4,5,6,7    одномерный масим - обращение к элементу []
         *
         * 123
         * 456      двумерный массив - обращение к элементу  [][]
         * 789
         */

        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);

        /**
         * 234
         * 2
         * 56       можно создавать не ровные массивы
         */

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(matrice[0][1]);
        System.out.println();
        int[][] matrice1 = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for (int i=0; i<matrice1.length; i++){      //первый цикл проходится по строкам
            for (int j=0; j<matrice1.length; j++){      //второй цикл проходится по каждому элементу строки
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
