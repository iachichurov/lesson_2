package gb.android.java;


import java.util.Arrays;

public class Main {

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void print2(int[][] array) {
        for (int[] a : array) {
            for (int i : a) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

/*
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;

 */
        int[] array1 = {1, 0, 1};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) array1[i] = 1;
            else array1[i] = 0;
        }
        print(array1);

/*
    Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
 */

        int[] array2 = new int[8];
        for (int i = 1; i < array2.length; i++) {
            array2[i] = i * 3;
        }
        print(array2);


/*
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) array3[i] = array3[i] * 2;
        }
        print(array3);

/*  Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами
 */

        int[][] array4 = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) array4[i][j] = 1;
            }
        }
        print2(array4);
    

/*
    ** Задать одномерный массив и найти в нем минимальный
    и максимальный элементы (без помощи интернета);
 */

        int[] array5 = {12, 10, 6, 4, 11, 8, 10, 14, 8, 8, 9, 2};

        int min = array5[0];
        int max = array5[0];
        for (int i : array5) {
            if (i < min) min = i;
            else if (i > max) max = i;
        }
        System.out.println("Minimum is " +min);
        System.out.println("Maximum is " +max);
    }

}

