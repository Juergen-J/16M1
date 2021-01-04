package lesson4;

import javax.sound.midi.Soundbank;

public class HelloString {
    public static void main(String[] args) {
        //  jamesBond();
        //  magicString();
        //london();
        //intToString();

    }

    public static void jamesBond() {
        String userName = "James";
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userName + "_" + userSecondName + "_" + age);
        String student = userName + "_" + userSecondName + "_" + age;
        System.out.println(student);
    }

    public static void magicString() {
        String firstName = "Andrei";
        String secondName = "Podlubni";
        String user = firstName + secondName;
        int lenght = user.length();
        System.out.println(lenght);
        String first10Chars = user.substring(0, 10); //вырезаем из строки
        System.out.println(first10Chars);
        System.out.println(first10Chars.toUpperCase());//перевод в верхний регистр

    }

    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0, 1).toUpperCase() + myLife.substring(1).toLowerCase());
//        System.out.println(myLife.);
    }

    public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
        int tryAndCry = Integer.parseInt(text);

        String anot = "#10";
        int myTry = Integer.parseInt(anot.substring(1));
        System.out.println(myTry);
    }

}
