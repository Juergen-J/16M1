package logic01;

public class Log22_30 {
    public static void main(String[] args) {
        System.out.println("-----------------#22");
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
        System.out.println(alarmClock(0, true));// → "off"

        System.out.println("-----------------#23");
        System.out.println(specialEleven(22));// →true
        System.out.println(specialEleven(23));// →true
        System.out.println(specialEleven(24));// →false

        System.out.println("-----------------#24");
        System.out.println(less20(18));// → true
        System.out.println(less20(19));// → true
        System.out.println(less20(20));// → false

        System.out.println("-----------------#25");
        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false

        System.out.println("-----------------#26");
        System.out.println(fizzString2(1));// →"1!"
        System.out.println(fizzString2(2));// →"2!"
        System.out.println(fizzString2(3));// →"Fizz!"

        System.out.println("-----------------#27");
        System.out.println(inOrderEqual(2, 5, 11, false));// → true
        System.out.println(inOrderEqual(5, 7, 6, false));// → false
        System.out.println(inOrderEqual(5, 5, 7, true));// → true

        System.out.println("-----------------#28");
        System.out.println(withoutDoubles(2, 3, true));// → 5
        System.out.println(withoutDoubles(3, 3, true));// → 7
        System.out.println(withoutDoubles(3, 3, false));// → 6

        System.out.println("-----------------#29");
        System.out.println(greenTicket(1, 2, 3));// → 0
        System.out.println(greenTicket(2, 2, 2));// → 20
        System.out.println(greenTicket(1, 1, 2));// → 10

        System.out.println("-----------------#30");
        System.out.println(sumLimit(2, 3));// → 5
        System.out.println(sumLimit(8, 3));// → 8
        System.out.println(sumLimit(8, 1));// → 9
    }

    public static String alarmClock(int week, boolean vacation) {
        String result = "";
        if (week > 0 && week < 6 && !vacation) {
            result = "7:00";
        } else if (vacation && week == 0 || week == 6) {
            result = "off";
        } else {
            result = "10:00";
        }
        return result;
    }

    public static boolean specialEleven(int num) {
        return num % 11 == 0 || num % 11 == 1;
    }

    public static boolean less20(int number) {
        return (number + 1) % 20 == 0 || (number + 2) % 20 == 0;
    }

    public static boolean answerCell(boolean morning, boolean mama, boolean sleep) {
        return !sleep && !morning || !sleep && mama;
    }

    public static String fizzString2(int n) {
        String result = "";
        if (n % 3 == 0) {
            result = "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            return n + "!";
        }
        return result + "!";

    }

    public static boolean inOrderEqual(int a, int b, int c, boolean order) {
        return a < b && b < c || order && a <= b && b <= c;
    }

    public static int withoutDoubles(int value1, int value2, boolean noDoubles) {
        int sum = 0;
        if (value1 == 6 && value2 == 6) {
            return 7;
        }
        if (noDoubles && value1 == value2) {
            sum = value1 + value2 + 1;

        } else {
            sum = value1 + value2;
        }
        return sum;
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || b == c || c == a) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(a).length() < String.valueOf(sum).length()) {
            return a;
        }
        return sum;
    }
}