package lesson13;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
//        System.out.println(redTicket(2, 2, 2));// → 10 ---#1
//        System.out.println(redTicket(2, 2, 1));// → 0
//        System.out.println(redTicket(0, 0, 0));// → 5

//        System.out.println(lastChars("last", "chars"));// → "ls" ---#2
//        System.out.println(lastChars("yo", "java"));// → "ya"
//        System.out.println(lastChars("hi", ""));// → "h@"

        //3 отдельным файлом


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Stroitrest 12");
        System.out.println("enter the number of doors...");
        int door = scanner.nextInt();
        System.out.println("enter the number of windows in this house...");
        int windows = scanner.nextInt();
        System.out.println("enter the size of the windows in in centimeters...");
        double windowsHeight = scanner.nextInt() / 100;
        double windowsWidth = scanner.nextInt() / 100;
        showCostRepairsThisHouse(door, windows, windowArea(windowsHeight, windowsWidth), windowPerimeter(windowsHeight, windowsWidth));


    }

    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else {
            return 0;
        }
    }

    public static String lastChars(String a, String b) {
        String result = "";
        if (a.isEmpty()) {
            result += "@";
        } else {
            result += a.substring(0, 1);
        }
        if (b.isEmpty()) {
            result += "@";
        } else {
            result += b.substring(b.length() - 1);
        }
        return result;
    }


    public static void showCostRepairsThisHouse(int door, int windows, double windowsArea, double windowPerimeter) {
        double costDoor = 1.8 * 120 + 5.8 * 100; //стоимость одной двери
        double costWindow = windowsArea * 100 + windowPerimeter * 100;

        System.out.println("Costs of doors: " + costDoor * door + " Euro");
        System.out.println("Costs of windows: " + costWindow * windows + " Euro");
    }

    public static double windowArea(double height, double width) {
        return height * width;
    }

    public static double windowPerimeter(double height, double width) {
        return height * 2 + width * 2;
    }

}
