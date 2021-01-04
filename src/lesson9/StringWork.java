package lesson9;

public class StringWork {
    public static void main(String[] args) {
//        nonStart("Hello", "There");// → "ellohere" -----------#4
//        nonStart("java", "code");// → "avaode"
//        nonStart("shotl", "java");// → "hotlava"

//        theEnd("Hello", true);// → "H" ----------------#5
//        theEnd("Hello", false);// → "o"
//        theEnd("ola", true);// → "o"

//        endsLy("oddly");// → true -----------#6
//        endsLy("y");// → false
//        endsLy("oddy");// → false

//        middleThree("Candy");// → "and" ---------------#7
//        middleThree("and");// → "and"
//        middleThree("solving");// → "lvi"

//        lastChars("last", "chars"); //→ "ls" --------#8
//        lastChars("yo", "java");// → "ya"
//        lastChars("hi", "");// → "h@"


//        withoutX2("xHi");// → "Hi"  ---#33
//        withoutX2("Hxi");// → "Hi"
//        withoutX2("Hi");// → "Hi"
    }

    public static void withoutX2(String x2) {
        String result = "";
        for (int i = 0; i < x2.length(); i++) {
            if (x2.substring(i, i + 1) != "x") {
                result += x2.substring(i, i + 1);
            } else {
                result += "";
            }
        }
        System.out.println(result);

    }  // 33

    public static void nonStart(String str1, String str2) {
        String result = str1.substring(1).toLowerCase() + str2.substring(1).toLowerCase();
        System.out.println(result);


    } //4

    public static void theEnd(String str, boolean y_n) {
        if (y_n) {
            System.out.println(str.substring(0, 1));
        } else {
            System.out.println(str.substring(str.length() - 1));
        }
    }  //5

    public static void endsLy(String str) {
        if (str.substring(str.length() - 2).equals("ly")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    } //6

    public static void middleThree(String str) {
        if (str.length() % 2 != 0) {
            System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 2));
        } else {
            System.out.println("The line is not even length");
        }
    } //7

    public static void lastChars(String str1, String str2) {
        String check = "";
        if (str1.equalsIgnoreCase(check)) {
            str1 = "@";
        } else if (str2.equalsIgnoreCase(check)) {
            str2 = "@";
        } else {

        }
        System.out.println(str1.substring(0, 1) + str2.substring(str2.length() - 1));

    } //8
}
