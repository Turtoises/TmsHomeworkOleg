package tms.homework.lesson12file.utils;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

public final class RandomSortNumberFileUtil {

    private static final File CREATING_FILE_PATH = Paths.get("resources", "lesson12file", "RandomNumberFile.txt").toFile();
    private static final File SORTING_FILE_PATH = Paths.get("resources", "lesson12file", "RandomNumberFileAfterSort.txt").toFile();
    private static final int AMOUNT_RANDOM_NUMBER = 10;
    private static final int AMOUNT_NUMBER_IN_STRING = 5;

    private RandomSortNumberFileUtil() {

    }

    public static void createAndFillFileRandomInt() {
        if (CREATING_FILE_PATH != null) {
            try {
                CREATING_FILE_PATH.createNewFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(CREATING_FILE_PATH))) {
                    StringBuffer buffer = new StringBuffer();
                    for (int i = 1; i <= AMOUNT_RANDOM_NUMBER; i++) {
                        buffer.append((int) (Math.random() * 100 - 50)).append(" ");
                        if (i % AMOUNT_NUMBER_IN_STRING == 0 || i == AMOUNT_RANDOM_NUMBER) {
                            writer.write(buffer.toString());
                            writer.newLine();
                            buffer = new StringBuffer();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createAndFillFileSortInt() {
        if (SORTING_FILE_PATH != null) {
            try {
                SORTING_FILE_PATH.createNewFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(SORTING_FILE_PATH))) {
                    int[] arraySort = readAndSortNumbersFromFile(CREATING_FILE_PATH);
                    StringBuffer buffer = new StringBuffer();
                    for (int i = 0; i < arraySort.length; i++) {
                        buffer.append(arraySort[i]).append(" ");
                        if ((i + 1) % AMOUNT_NUMBER_IN_STRING == 0 || i == arraySort.length - 1) {
                            writer.write(buffer.toString());
                            writer.newLine();
                            buffer = new StringBuffer();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int[] readAndSortNumbersFromFile(File fileForSort) {
        if (fileForSort != null && fileForSort.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileForSort))) {
                StringBuffer buffer = new StringBuffer();
                while (reader.ready()) {
                    buffer.append(reader.readLine());
                }
                String[] arrayString = buffer.toString().trim().split(" ");
                int[] arrayRandom = new int[arrayString.length];

                for (int i = 0; i < arrayRandom.length; i++) {
                    arrayRandom[i] = Integer.valueOf(arrayString[i]);
                }
                Arrays.sort(arrayRandom);
                return arrayRandom;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new int[0];
    }
}
