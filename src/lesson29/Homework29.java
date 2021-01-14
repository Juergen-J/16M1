package lesson29;

import library.PrintArray;

public class Homework29 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
        //System.out.println(checkPalindrom("поп"));// -> true
        //System.out.println(checkPalindrom("школа"));// -> false
    }

    private static boolean checkPalindrom(String str) {
        reverseString(str);
        return false;
    }

    public static String reverseString(String str) {
        String temp = str.toLowerCase();
        getStringWithoutSpace(temp);
        System.out.println(temp);
        return "";
    }

    public static String getStringWithoutSpace(String str) {
        String result = "";
        int count = 0;
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (Character.isSpaceChar(temp[i])) {
                count++;
            }
        }
        char[] resultTemp = new char[temp.length - count];
//        for (int j = 0; j < temp.length; j++) {
//            if (!Character.isSpaceChar(temp[j])) {
//                resultTemp[j] = temp[j];
//            }
//        }
        PrintArray.PrintCharArray(resultTemp);
        return result;
    }

}
