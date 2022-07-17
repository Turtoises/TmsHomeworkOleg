package tms.homework.lesson11exception;

import tms.homework.lesson11exception.utils.CreatExceptionUtil;

import java.io.IOException;
import java.util.EmptyStackException;

public class TestException {

    public static void main(String[] args) {

        //Генерация NullPointerException. Отловите возникшее исключение и выведите stackTrace
        try {
            CreatExceptionUtil.getNullPointerException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        CreatExceptionUtil.getArrayIndexOutOfBoundsException();

        //Вызвать этот метод, выбрасывающий исключение IllegalArgumentException,
        // и отловить исключение. Вывести в консоль сообщение этого исключения.
        try {
            CreatExceptionUtil.getllegalArgumentException();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Создать метод случайным образом выбрасывающий одно из 3-х исключений. Исключения выбрать самому.
        // Вызвать этот метод в блоке try-catch, отлавливающем каждое из 3-х по отдельности
        try {
            CreatExceptionUtil.getRandomException();
        } catch (ArithmeticException e) {
            System.err.println(e.getClass().getSimpleName());
        } catch (EmptyStackException e) {
            System.err.println(e.getClass().getSimpleName());
        } catch (ClassCastException e) {
            System.err.println(e.getClass().getSimpleName());
        }

        //Написать метод, который в 50% случаев бросает исключение.
        // Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
        try {
            System.out.println(CreatExceptionUtil.getFiftyPercentExemption());
            System.out.println("Block of try");
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("Block of finally");
        }
    }
}
