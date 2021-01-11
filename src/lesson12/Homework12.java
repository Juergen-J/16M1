package lesson12;

public class Homework12 {
    public static void main(String[] args) {
//        System.out.println(inOrder(1, 2, 4, false));// → true  -----#1
//        System.out.println(inOrder(1, 2, 1, false));// → false
//        System.out.println(inOrder(1, 1, 2, true));// → true

//        System.out.println(lessBy10(1, 7, 11));// → true -----#2
//        System.out.println(lessBy10(1, 7, 10));// → false
//        System.out.println(lessBy10(11, 1, 7));// → true

//        System.out.println(theEnd("Hello", true));// →"H" ------#3
//        System.out.println(theEnd("Hello", false));// →"o"
//        System.out.println(theEnd("oh", true));// →"o"

//        System.out.println(endsLy("oddly"));// → true ---------#4
//        System.out.println(endsLy("y"));// → false
//        System.out.println(endsLy("oddy"));// → false

//        System.out.println(middleThree("Candy"));// → "and" -----#5
//        System.out.println(middleThree("and"));// → "and"
//        System.out.println(middleThree("solving"));// → "lvi"


    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return b > a && a * c > b || bOk && a * c > b;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return a - b >= 10 || a - c >= 10 || b - a >= 10 || b - c >= 10 || c - a >= 10 || c - b >= 10;
    }

    public static String theEnd(String str, boolean fOr) {
        String result = "";
        if (fOr) {
            result = str.substring(0, 1);
        } else {
            result = str.substring(str.length() - 1);
        }
        return result;
    }

    public static boolean endsLy(String str) {
        return str.length() > 2 && str.substring(str.length() - 2).equals("ly");
    }

    public static String middleThree(String str) {
        int temp = str.length() / 2;
        return str.substring(temp - 1, temp + 2);
    }

}
