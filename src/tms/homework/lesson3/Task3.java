package tms.homework.lesson3;

import java.util.Scanner;

public class Task3 {

    /*
     *Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
     *Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
     *Программа должна выводить:
     *a. Количество дней
     *b. Сумму осадков за этот период
     *c. Среднее количество осадков за этот период
     *d. Максимальное количество дневных осадков за этот период
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int numberDay = scanner.nextInt();
        int dayRainfall = 0;
        int amountRainfall = 0;
        double middleRainfall = 0;
        int maxRainfall = 0;

        if (numberDay <= 0) {
            System.out.println("Uncorrect enter");
        } else lebel1:{

            System.out.println("Enter the rainfalls");

            for (int i = 0; i < numberDay; i++) {
                dayRainfall = scanner.nextInt();
                amountRainfall += dayRainfall;
                if (dayRainfall > maxRainfall) {
                    maxRainfall = dayRainfall;
                }
                if (dayRainfall < 0) {
                    System.out.println("Uncorrect enter");
                    break lebel1;
                }
            }

            middleRainfall = Math.round(amountRainfall * 1.0 / numberDay * 100) / 100.0;

            System.out.println("The number of days is " + numberDay);
            System.out.println("The amount of rainfalls is " + amountRainfall);
            System.out.println("The middle amount of rainfall is " + middleRainfall);
            System.out.println("The maximum of rainfalls is " + maxRainfall);

        }

        scanner.close();

    }
}