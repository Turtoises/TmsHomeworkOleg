package tms.homework.lesson4and5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    //Написать программу, удаляющую все целые числа из массива,
    // которые равны тому, что ввёл пользователь. В результате
    // должен получиться новый массив, в котором нет заданных элементов.
    // Распечатать полученный массив.

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 3, 4, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numberUser = scanner.nextInt();
        scanner.close();

        int numberDelete = 0;

        for (int number : array) {
            numberDelete += number == numberUser ? 1 : 0;
        }

        int[] arrayNew = new int[array.length - numberDelete];
        int indexArrayNew = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberUser) {
                arrayNew[indexArrayNew] = array[i];
                indexArrayNew++;
            }
        }

        System.out.println(Arrays.toString(arrayNew));
    }

}


