package tms.homework.lesson12file.utils;

import java.io.*;
import java.nio.file.Paths;

public final class CalculateLetterOfFileUtil {

    private static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final File RESULT_FILE_PATH = Paths.get("resources", "lesson12file", "ResultCountNumberLetters.txt").toFile();

    private CalculateLetterOfFileUtil() {
    }

    public static void writeResultIntoFile(File userFile) {
        if (userFile != null && userFile.isFile()) {
            int[] arrayResult = readUserFileAndCalculate(userFile);
            if (arrayResult.length != 0) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_FILE_PATH))) {
                    for (int i = 0; i < arrayResult.length; i++) {
                        if (arrayResult[i] != 0) {
                            writer.write(RUSSIAN_ALPHABET.charAt(i) + " - " + arrayResult[i]);
                            writer.newLine();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void calculateLetterInString(int[] amount, String strForCalculate) {
        if (strForCalculate != null || strForCalculate.length() != 0) {
            strForCalculate = strForCalculate.toLowerCase();
            for (int i = 0; i < strForCalculate.length(); i++) {
                char letter = strForCalculate.charAt(i);
                int indexLetter = RUSSIAN_ALPHABET.indexOf(letter);
                if (indexLetter != -1) {
                    amount[indexLetter] += 1;
                }
            }
        }
    }

    private static int[] readUserFileAndCalculate(File userFile) {
        int[] amount = new int[RUSSIAN_ALPHABET.length()];

        try (BufferedReader reader = new BufferedReader(new FileReader(userFile))) {
            while (reader.ready()) {
                calculateLetterInString(amount, reader.readLine());
            }
            return amount;
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }
}
