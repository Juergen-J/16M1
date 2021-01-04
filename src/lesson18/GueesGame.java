package lesson18;

import java.util.Scanner;

public class GueesGame {
    public static void main(String[] args) {
        game();

    }

    public static void game() {
        int range = customerRange();
        int attempts = customerAttemps();
        int secretComputerNumber = giveMeRandom(range);
        int countAttempts = 0;
        System.out.println("Go!");
        int customerNumber;
        Scanner src = new Scanner(System.in);
        customerNumber = src.nextInt();

        while (customerNumber != secretComputerNumber) {
            System.out.println(compareNumbers(customerNumber, secretComputerNumber));
            customerNumber = src.nextInt();
            countAttempts++;
            if (attempts == countAttempts) {
                attemptsDone();
            }
        }
        System.out.println("The End");
    }

    public static void attemptsDone() {
        System.out.println("Game Over");
    }

    public static String compareNumbers(int custumN, int custum) {
        if (custum == custumN) {
            return "Super";
        } else if (custumN > custum) {
            return "bolsche";
        } else {
            return "mensche";
        }
    }

    private static int customerAttemps() {
        Scanner src = new Scanner(System.in);
        System.out.println("Skolko popitok?");
        return src.nextInt();
    }

    private static int customerRange() {
        Scanner src = new Scanner(System.in);
        System.out.println("diapazon");
        return src.nextInt();
    }

    public static int giveMeRandom(int max) {
        return (int) (Math.random() * (max - 0) + 1 + 0);
    }
}