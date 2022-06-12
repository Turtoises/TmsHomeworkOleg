package tms.homework.lesson3;

import java.util.Scanner;

public class Task1 {

    //Написать программу, вычисляющую сумму цифр введённого пользователем целого числа

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        long number = (long) Math.abs(scanner.nextLong());
        int amount = 0;

        while (number != 0) {
            amount += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is equal to " + amount);
        scanner.close();
    }
}
