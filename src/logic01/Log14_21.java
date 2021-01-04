package logic01;

public class Log14_21 {
    public static void main(String[] args) {
        System.out.println("-----------#14");
        System.out.println(old35(3));// →true ------#14
        System.out.println(old35(10));// →true
        System.out.println(old35(15));// →false

        System.out.println("-----------#15");
        System.out.println(teenSum(3, 4));// → 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19

        System.out.println("-----------#16");
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"

        System.out.println("-----------#17");
        System.out.println(inOrder(1, 2, 4, false));// →true
        System.out.println(inOrder(1, 2, 1, false));// →false
        System.out.println(inOrder(1, 1, 2, true));// →true

        System.out.println("-----------#18");
        System.out.println(lessBy10(1, 7, 11));// →true
        System.out.println(lessBy10(1, 7, 10));// →false
        System.out.println(lessBy10(11, 1, 7));// →true

        System.out.println("-----------#19");
        System.out.println(redTicket(2, 2, 2));// →10
        System.out.println(redTicket(2, 2, 1));// →0
        System.out.println(redTicket(0, 0, 0));// →5

        System.out.println("-----------#20");
        System.out.println(shareDigit(12, 23));// →true
        System.out.println(shareDigit(12, 43));// →false
        System.out.println(shareDigit(12, 44));// →false

        System.out.println("-----------#21");
        System.out.println(squirrelPlay(70, false));// →true
        System.out.println(squirrelPlay(95, false));// →false
        System.out.println(squirrelPlay(95, true));// →true
    }

    public static boolean old35(int number) {
        return number % 3 == 0 ^ number % 5 == 0;
    }

    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return a + b;
    }

    public static String fizzString(String str) {
        String result = "";
        if (str.charAt(0) == 'f') {
            result += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            result += "Buzz";
        }
        if (str.isEmpty()) {
            result = str;
        }
        return result;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOK) {
        return b > a && a * c > b || bOK && a * c > b;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return a - 9 > b || a - 9 > c || b - 9 > a || b - 9 > c || c - 9 > a || c - 9 > b;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b == c && b != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean shareDigit(int a, int b) {
        return a / 10 == b % 10 || a % 10 == b / 10;
    }

    public static boolean squirrelPlay(int temperature, boolean isSommer) {
        return temperature > 59 && temperature < 91 || isSommer && temperature < 101 && temperature > 59;
    }
}
