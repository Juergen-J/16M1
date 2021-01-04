package lesson6;

import java.util.Scanner;

public class HelloSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("KidsScore...");
        int score = in.nextInt();//

        myFirstSwitch(score);

    }

    public static void myFirstSwitch(int score) {
        String prize = "";
        switch (score) {
            case 1:
                prize = "Xz";
                break;
            case 2:
                prize = "Bells";
                break;
            case 3:
                prize = "10 Euro";
                break;
            case 4:
                prize = "iPhone One";
                break;
            case 5:
                prize = "PSP";
                break;

            default:
                prize = "false";

        }

        System.out.println(prize);

    }

}
