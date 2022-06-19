package tms.homework.lesson4and5;

import java.util.Arrays;

public class Task1 {

    //Напишите программу, которая циклически сдвигает элементы массива
    // вправо на одну позицию, и печатает результат.
    // Цикличность означает, что последний элемент массива становится самым первым его элементом.

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        if (array.length <= 1) {
            System.out.println(Arrays.toString(array));
        } else {
            int amountArray = array.length;
            int numberLast = array[amountArray - 1];
            for (int i = amountArray - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = numberLast;
            System.out.println(Arrays.toString(array));
        }

    }

}
