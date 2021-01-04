package lesson6;

import java.util.Scanner;

public class HelloSwitch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Month Number?...");
//        System.out.println(getMonthName(scanner.nextInt()));
        System.out.println("Month Name?...");
        System.out.println(getMonthNumber(scanner.nextLine()));

    }

    public static String getMonthName(int monthNumber) {
        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;

            default:
                monthName = "false";
                break;
        }
        return monthName;
    }

    public static int getMonthNumber(String monthName) {
        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
        int monthNumber = 0;
        switch (monthName) {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;

            case "March":
                monthNumber = 3;
                break;

            case "April":
                monthNumber = 4;
                break;

            case "May":
                monthNumber = 5;
                break;

            case "June":
                monthNumber = 6;
                break;

            case "July":
                monthNumber = 7;
                break;

            case "August":
                monthNumber = 8;
                break;

            case "September":
                monthNumber = 9;
                break;

            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;

            default:
                monthNumber = -1;
                break;
        }
        return monthNumber;
    }
}
