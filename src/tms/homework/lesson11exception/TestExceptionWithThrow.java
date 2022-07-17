package tms.homework.lesson11exception;

import tms.homework.lesson11exception.utils.CreatExceptionUtil;

public class TestExceptionWithThrow {

    public static void main(String[] args) {

        //Создать метод выбрасывающий одно из существующих в JDK исключений, отловить его и выбросить
        // своё собственное, указав в качестве причины отловленное
        try {
            CreatExceptionUtil.getStringIndexOutOfBoundsException();
        } catch (Exception e) {
            throw new MyUncheckedException(e);
        }
    }
}
