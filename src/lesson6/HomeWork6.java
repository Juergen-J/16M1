package lesson6;

import java.util.Scanner;


public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the age of the buyer..."); //1
        System.out.println(doItAlkShop(scanner.nextInt()));

        System.out.println("enter month number...");
        System.out.println(getMonthToSeason(scanner.nextInt()));

    }

    public static String doItAlkShop(int age) {
        String answer = "";

        switch (age) {
            case 10:
            case 17:
                answer = age + "!!! - alcohol cannot be sold";
                break;
            case 18:
            case 20:
            case 30:
                answer = "you can sell alcohol";
                break;
            default:
                answer = "data not found";
                break;

        }
        return answer;
    }

    public static String getMonthToSeason(int monthNumber) {
        String answer = "";
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                answer = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                answer = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                answer = "Summer";
                break;

            case 9:
            case 10:
            case 11:
                answer = "Fall";
                break;

            default:
                answer = "false";
                break;
        }
        return answer;
    }
}
