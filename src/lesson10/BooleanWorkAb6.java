package lesson10;

public class BooleanWorkAb6 {
    public static void main(String[] args) {
//        System.out.println(teaParty(6, 8));//1      ----------#6
//        System.out.println(teaParty(3, 8));//0
//        System.out.println(teaParty(20, 6));//2
//        System.out.println(teaParty(2, 60));//0

//        System.out.println(twoAsOne(1, 2, 3));// → true -----------#7
//        System.out.println(twoAsOne(3, 1, 2));// → true
//        System.out.println(twoAsOne(3, 2, 2));// → false
//        System.out.println(twoAsOne(6, 8, 2));// → true

//        System.out.println(lastDigit(23, 19, 13));// → true --------#8
//        System.out.println(lastDigit(23, 19, 12));// → false
//        System.out.println(lastDigit(23, 19, 3));// → true
//        System.out.println(lastDigit(19, 19, 3));// → true
//        System.out.println(lastDigit(19, 39, 79));// → true

//        System.out.println(maxMod5(2, 3)); // →3 ----------#9
//        System.out.println(maxMod5(6, 2)); // →6
//        System.out.println(maxMod5(3, 2)); //→3
//        System.out.println(maxMod5(3, 3)); //→0
//        System.out.println(maxMod5(15, 5)); //→5

//        System.out.println(blueTicket(9, 1, 0));// → 10 ----------#10
//        System.out.println(blueTicket(9, 2, 0));// → 0
//        System.out.println(blueTicket(6, 1, 4));// → 10
//        System.out.println(blueTicket(18, 2, 8));// → 5

//        System.out.println(dateFashion(5, 10));// → 2 -------------#11
//        System.out.println(dateFashion(5, 2));// → 0
//        System.out.println(dateFashion(5, 5));// → 1

//        System.out.println(sortaSum(3, 4));// → 7  -----------------#12
//        System.out.println(sortaSum(9, 4));// → 20
//        System.out.println(sortaSum(10, 11));// → 21

//        System.out.println(in1To10(5, false));// → true ----------------#13
//        System.out.println(in1To10(11, false));// → false
//        System.out.println(in1To10(11, true));// → true

//        System.out.println(old35(3));// → true --------------------#14
//        System.out.println(old35(10));// → true
//        System.out.println(old35(15));// → false

//        System.out.println(teenSum(3, 4));// → 7 --------------------#15
//        System.out.println(teenSum(10, 13));// → 19
//        System.out.println(teenSum(13, 2));// → 19

//        System.out.println(fizzString("fig"));// →"Fizz" -------------#16
//        System.out.println(fizzString("dib"));// →"Buzz"
//        System.out.println(fizzString("fib"));// →"FizzBuzz"
//        System.out.println(fizzString("abc"));// →"abc"
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;//sad
        } else if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;//super
        } else {
            return 1; //norm
        }

    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static int maxMod5(int number1, int number2) {
        if (number1 == number2) {
            return 0;
        } else {
            if (number1 > number2 && number1 % 5 != number2 % 5) {
                return number1;
            } else {
                return number2;
            }
        }

    }

    public static int blueTicket(int a, int b, int c) {
        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;
        if (sumAB - 10 == sumBC || sumAB - 10 == sumAC) {
            return 5;
        } else if (sumAB == 10 || sumBC == 10 || sumAC == 10) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int dateFashion(int youAtr, int either) {
        if (youAtr >= 8 || either >= 8) {
            return 2;
        } else if (youAtr <= 2 || either <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public static boolean in1To10(int n, boolean externalMode) {
        return (n <= 1 || n >= 10) && externalMode || n >= 1 && n <= 10 && !externalMode;
    }

    public static boolean old35(int number) {
        return number % 3 == 0 ^ number % 5 == 0;
    }

    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 13 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static String fizzString(String str) {
        String temp = "";
        if (str.substring(0, 1).equals("f")) {
            temp = "Fizz";
        }
        if (str.substring(str.length() - 1).equals("b")) {
            temp += "Buzz";
        }
        if (temp.equals("")) {
            temp = str;
        }
        return temp;

    }

}
