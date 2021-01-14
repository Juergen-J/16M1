package lesson29;

import library.PrintArray;

public class Homework29 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrom("поп"));// -> true
        System.out.println(checkPalindrom("школа"));// -> false
    }

    private static boolean checkPalindrom(String str) {
        String temp = reverseString(str);
        //System.out.println(temp);
        return getStringWithoutSpace(str).equals(temp);
    }

    public static String reverseString(String str) {
        String output = "";
        String temp = getStringWithoutSpace(str);
        for (int i = temp.length() - 1; i >= 0; i--) {
            output += temp.charAt(i);
        }
//        System.out.println(output);
        return output;
    }

    public static String getStringWithoutSpace(String str) {
        String result = "";
        str = str.toLowerCase();
        char[] temp = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            if (Character.isLetter(str.charAt(j))) {
                result += temp[j];
            }
        }
        //System.out.println(result);
        return result;
    }

}
