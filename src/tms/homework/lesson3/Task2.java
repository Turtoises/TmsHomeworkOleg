package tms.homework.lesson3;

import java.util.Scanner;

public class Task2 {

    //Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numberUser = scanner.nextInt();
        int numberFibonacciOne = 1;
        int numberFibonacciTwo = 1;
        int numberFibonacciThree = 0;

        if (numberUser <= 1) {
            System.out.println("No number");
        } else {
            System.out.println(numberFibonacciOne);
            System.out.println(numberFibonacciTwo);

            while ((numberFibonacciThree = numberFibonacciOne + numberFibonacciTwo) < numberUser) {
                System.out.println(numberFibonacciThree);
                numberFibonacciOne = numberFibonacciTwo;
                numberFibonacciTwo = numberFibonacciThree;
            }
        }

        scanner.close();

    }
}
