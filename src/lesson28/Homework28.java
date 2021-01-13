package lesson28;

import library.PrintArray;

import java.util.Locale;

public class Homework28 {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10

        System.out.println("****************");
        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true

        System.out.println("****************");
        makePi();// → [3, 1, 4]
    }

    public static int roundSum(int a, int b, int c) {
        int sum = 0;
        sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    public static int round10(int num) {
        int temp = num / 10;
        if (num % 10 >= 5) {
            temp *= 10;
            return temp + 10;
        }
        return temp * 10;
    }

    public static boolean endOther(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str2.equalsIgnoreCase(str1.substring(str1.length() - str2.length()));
        }
        return str1.equalsIgnoreCase(str2.substring(str2.length() - str1.length()));
    }

    public static int[] makePi() {
        int[] result = new int[3];
        int pi = (int) (Math.PI * 100);
        result[0] = pi / 100;
        pi %= 100;
        result[1] = pi / 10;
        pi %= 10;
        result[2] = pi;
        PrintArray.printIntArray(result);
        return result;
    }
}
