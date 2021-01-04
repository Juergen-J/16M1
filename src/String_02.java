public class String_02 {
    public static void main(String[] args) {
//        System.out.println(doubleChar("The"));// → "TThhee"  ----------#1
//        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
//        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"

//        System.out.println(countCode("aaacodebbb"));// → 1 -------#2
//        System.out.println(countCode("codexxcode"));// → 2
//        System.out.println(countCode("cozexxcope"));// → 2
//        System.out.println(countCode("urofCOMEfCosE"));// → 2

//        System.out.println(bobThere("abcbob"));// → true ------#3
//        System.out.println(bobThere("b9b"));// → true
//        System.out.println(bobThere("bac"));// → false

//        System.out.println(repeatEnd("Hello", 3));// → "llollollo" ---------#4
//        System.out.println(repeatEnd("Hello", 2));// → "lolo"
//        System.out.println(repeatEnd("Hello", 1));// → "o"

        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false

    }

    public static String doubleChar(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                temp += str.substring(i, i + 1);
            }
        }
        return temp;
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

    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }

    public static boolean prefixAgain(String str, int n) {

        return false;
    }


}
