package tms.homework.lesson4and5;

import java.util.Arrays;

public class Task3 {

    //Написать программу, которая преобразовывает двумерный массив
    // в одномерный массив со всеми элементами двумерного.

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7,},
                {8},
                {11, 12, 13, 14, 15},
        };

        int numberOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            numberOfElements += array[i].length;

        }

        int[] arrayNew = new int[numberOfElements];
        int indexArrayNew = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayNew[indexArrayNew] = array[i][j];
                indexArrayNew++;
            }
        }

        System.out.println(Arrays.toString(arrayNew));
    }
}
