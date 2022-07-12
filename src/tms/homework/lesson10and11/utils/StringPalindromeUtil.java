package tms.homework.lesson10and11.utils;

public final class StringPalindromeUtil {

    private StringPalindromeUtil() {
    }

    //Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях

    public static boolean isPalindrome(String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }
        str = str.replace(" ", "");
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
