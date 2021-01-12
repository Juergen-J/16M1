package lesson27;

public class Homework27 {
    public static void main(String[] args) {
        System.out.println("**************#3");
        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19

        System.out.println("**************#4");
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0

        System.out.println("**************#7");
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"

        System.out.println("**************#8");
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
    }

    public static int blackjack(int a, int b) {
        return Math.max(findMax(a), findMax(b));
    }

    public static int findMax(int x) {
        return x > 21 ? 0 : x;
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            a = 0;
            b = 0;
        }
        if (a == c) {
            a = 0;
            c = 0;
        }
        if (b == c) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }

    public static String starOut(String str) {
        String result = "";
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '*') {
                temp[i] = '!';
                if (Character.isLetter(str.charAt(i - 1))) {
                    temp[i - 1] = '!';
                }
                if (Character.isLetter(str.charAt(i + 1))) {
                    temp[i + 1] = '!';
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != '!') {
                result += temp[i];
            }
        }
        return result;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
}
