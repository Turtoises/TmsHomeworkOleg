package tms.homework.lesson10and11;

import tms.homework.lesson10and11.utils.ConvertNumberUtil;

public class ConvertNumberTest {

    public static void main(String[] args) {

        String strTest1 = "DCCLXXIV";
        System.out.println(strTest1 + "=" + ConvertNumberUtil.getRomanIntoArabic(strTest1));

        String strTest2 = "DCCLVIII";
        System.out.println(strTest2 + "=" + ConvertNumberUtil.getRomanIntoArabic(strTest2));

        System.out.println(ConvertNumberUtil.getRomanIntoArabic(null));


    }
}
