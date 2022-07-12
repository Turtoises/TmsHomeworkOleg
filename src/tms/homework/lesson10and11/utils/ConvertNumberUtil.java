package tms.homework.lesson10and11.utils;

public final class ConvertNumberUtil {

    public static final char NUMBER_ROMAN_M = 'M';
    public static final int NUMBER_ARABIC_1000 = 1000;
    public static final char NUMBER_ROMAN_D = 'D';
    public static final int NUMBER_ARABIC_500 = 500;
    public static final char NUMBER_ROMAN_C = 'C';
    public static final int NUMBER_ARABIC_100 = 100;
    public static final char NUMBER_ROMAN_L = 'L';
    public static final int NUMBER_ARABIC_50 = 50;
    public static final char NUMBER_ROMAN_X = 'X';
    public static final int NUMBER_ARABIC_10 = 10;
    public static final char NUMBER_ROMAN_V = 'V';
    public static final int NUMBER_ARABIC_5 = 5;
    public static final char NUMBER_ROMAN_I = 'I';
    public static final int NUMBER_ARABIC_1 = 1;

    private ConvertNumberUtil() {
    }

    //Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
    //Границы чисел: от 1 до 3999

    public static int getRomanIntoArabic(String numberRoman) {

        if (numberRoman == null || numberRoman.trim().length() == 0) {
            return 0;
        }

        numberRoman = numberRoman.toUpperCase();
        short[] numbersArabicArray = new short[numberRoman.length()];

        for (int i = 0; i < numberRoman.length(); i++) {
            char number = numberRoman.charAt(i);
            switch (number) {
                case NUMBER_ROMAN_M:
                    numbersArabicArray[i] = NUMBER_ARABIC_1000;
                    break;
                case NUMBER_ROMAN_D:
                    numbersArabicArray[i] = NUMBER_ARABIC_500;
                    break;
                case NUMBER_ROMAN_C:
                    numbersArabicArray[i] = NUMBER_ARABIC_100;
                    break;
                case NUMBER_ROMAN_L:
                    numbersArabicArray[i] = NUMBER_ARABIC_50;
                    break;
                case NUMBER_ROMAN_X:
                    numbersArabicArray[i] = NUMBER_ARABIC_10;
                    break;
                case NUMBER_ROMAN_V:
                    numbersArabicArray[i] = NUMBER_ARABIC_5;
                    break;
                case NUMBER_ROMAN_I:
                    numbersArabicArray[i] = NUMBER_ARABIC_1;
                    break;
                default:
                    return 0;
            }
        }
        int numberArabic = 0;

        for (int i = 0; i < numbersArabicArray.length - 1; i++) {
            if (numbersArabicArray[i] < numbersArabicArray[i + 1]) {
                numberArabic -= numbersArabicArray[i];
            } else
                numberArabic += numbersArabicArray[i];
        }
        numberArabic += numbersArabicArray[numbersArabicArray.length - 1];

        return numberArabic;
    }

}

