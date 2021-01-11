package lesson26;

public class Homework26 {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));// → 1 -------#2
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
        System.out.println(countCode("urofCOMEfCosE"));// → 2

        System.out.println(bobThere("abcbob"));// → true ------#3
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 3 && str.substring(i, i + 2).equalsIgnoreCase("co") && str.substring(i + 3, i + 4).equalsIgnoreCase("e")) {
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase("b") && str.substring(i + 2, i + 3).equalsIgnoreCase("b")) {
                return true;
            }
        }
        return false;
    }
}
