package lesson4;

import java.util.SplittableRandom;

public class HomeWork4 {
    public static void main(String[] args) {
        writeChar(); //1
        writeMyName();//2

        System.out.println(writeMyData("Juergen", "Jurk", 26, "Berlin", "Strasse"));//3

        System.out.println();
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));

        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // → "[[word]]"

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }

    public static String writeMyData(String name, String surname, int age, String city, String street) {
        return "Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nCity: " + city + "\nStreet: " + street;

    }

    public static void writeChar() {
        System.out.println("\uD83D\uDE37");
        System.out.println("\u260E");
        System.out.println("\u260F");
        System.out.println("\u00A7");
        System.out.println("\u00A9");
        System.out.println("\u2122");
        System.out.println("\u20BD");
        System.out.println("\u20AC");
        System.out.println("\u0024");
        System.out.println("\u2648");
        System.out.println("\u2654");
        System.out.println("\u2661");

    }

    public static void writeMyName() {
        String myName = "Juergen";
        String myProfession = "Programmer";
        System.out.println("\u00AB" + myName + " " + myProfession + "\u00BB");
    }

    public static String helloName(String name) {
        String hello = "Hello ";
        String sign = "!";
        return hello + name + sign;
    }

    public static String makeOutWord(String sign, String name) {
        return sign.substring(0, 2) + name + sign.substring(2);
    }

    public static String firstHalf(String str) {
        int lenght = str.length() / 2;
        return str.substring(0, lenght);
    }


}
