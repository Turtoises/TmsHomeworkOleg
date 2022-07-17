package tms.homework.lesson11exception.utils;

import java.util.Arrays;
import java.util.EmptyStackException;

public final class CreatExceptionUtil {

    private CreatExceptionUtil() {
    }

    //Генерация NullPointerException
    public static void getNullPointerException() {
        String str = null;

        str.length();
    }

    //Написать метод, который создаст, а затем отловит ArrayIndexOutOfBoundsException и корректно его обработает.
    public static void getArrayIndexOutOfBoundsException() {
        int[] array = new int[5];

        try {
            System.out.println(array[7]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Wrong index of the array: " + e);
        }
    }

    //Создать метод, выбрасывающий исключение IllegalArgumentException
    public static void getllegalArgumentException() {
        int[] array = new int[5];

        Arrays.sort(array, 5, 3);
    }

    //Создать метод выбрасывающий одно из существующих в JDK исключений
    public static void getStringIndexOutOfBoundsException() {
        String str = "";

        System.out.println(str.charAt(1));
    }

    //Создать метод случайным образом выбрасывающий одно из 3-х исключений
    public static void getRandomException() {
        switch ((int) (Math.random() * 3)) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new EmptyStackException();
            case 2:
                throw new ClassCastException();
            default:
                break;
        }
    }

    //Написать метод, который в 50% случаев бросает исключение
    public static int getFiftyPercentExemption() {
        return 1 / ((int) (Math.random() * 2));
    }

}
