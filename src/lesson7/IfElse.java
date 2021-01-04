package lesson7;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        scope - область видимости
//        swap
//        a=5;
//        b=8;
//        a=a+b;
//        b=a-b;
//        a=a-b;

//        a=a+b-(b-a);
//       LateX

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age...");
        System.out.println(salesPermission(scanner.nextInt()));

    }

    public static String salesPermission(int age) {
        String result = "";

        if (age >= 16 && age < 18) {
            result = "light alcohol";
        } else if (age >= 18) {
            result = "alcohol";
        } else {
            result = "false";
        }
        return result;
    }

    public static String methode() {
        return "";
    }
}
