package lesson10;

public class Homework10 {
    public static void main(String[] args) {
//        getEvenNumber(4, 16); //> 4,6,8,10,12,14,16

//        getOddNumber(4, 16); //> 5,7,9,11,13,15

//        getNumberMultipleOf11(0, 68);// 11,22,33,44,55,66

//        System.out.println(leapYear(2020)); //> true
//        System.out.println(leapYear(2021)); //> false
//        System.out.println(leapYear(1900)); //> false

//        findNumber(); //798, 1726, 2654

    }

    public static void getEvenNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 00) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void getOddNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void getNumberMultipleOf11(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void findNumber() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }

    }
}
