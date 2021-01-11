package lesson16;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));// → true ----------#1
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
//
//        System.out.println(doubleChar("The"));// → "TThhee"  ----------#2
//        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
//        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"

//        multiplicationTable(3); //  ------------#3

//        printDivisors(32);// ----------#4

//        System.out.println(getPasswor(15)); //xcrp}YfbVX\Wo~x                 ---------#5

    }

    public static boolean makeBricks(int smalBox, int bigBox, int goal) {

        return smalBox + bigBox * 5 == goal || smalBox == goal || bigBox * 5 == goal;

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

    public static void multiplicationTable(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }

    public static void printDivisors(int number) {
        int divisors = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
                divisors++;
            }
        }
        System.out.println("Toal divisors: " + divisors);
    }


    public static String getPasswor(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            String temp = giveMeChar(giveMeRandom(), giveMeRandom());
            if (temp.equals("\u0081") || temp.equals("\u0082") || temp.equals("\u0080")) {
                temp = "-";
                result += temp;
            } else {
                result += temp;
            }
        }

        return result;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myLovelyChar = (char) (Math.random() * (max - min) + 1 + min);
        result = String.valueOf(myLovelyChar);
        return result;
    }

    public static int giveMeRandom() {
        return (int) (Math.random() * (132 - 80) + 1 + 80);
    }
}
