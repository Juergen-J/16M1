package lesson2;

public class DayTwoInteger {
    public static void main(String[] args) {
        helloInt();
        helloLong();
        helloByte();
        helloShort();
        magicNumber();
        //definition
        //declaration
        //initialisation
    }

    public static void helloInt() {
        int month = 11;
        int day = 24;
        int year = 2020;
        System.out.println("Today is " + month + "." + day + "." + year);
    }

    public static void helloLong() {
        long cl = 12_345_678_910_110L; // big L!


    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
//значение зацикливается
    }

    public static void helloShort() {
        short a=23432;
        short b=2423;
        short c=(short) (a+b);

    }

    public static void magicNumber() {
        int hexValue = 0x100;
        int binary= 0B10011001;
        int octal= 0757;

    }
}