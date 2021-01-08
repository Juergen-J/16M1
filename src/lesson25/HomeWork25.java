package lesson25;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HomeWork25 {
    public static void main(String[] args) {
        System.out.println("*************************#11");
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100

        System.out.println("*************************#12");
        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100

        System.out.println("*************************#13");
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// →"Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"

        System.out.println("*************************#21");
        whileMethode(8, 15);//8,8,8,8,8,8,8,8,8,8,8,8,8,8

        System.out.println("*************************#22");
        whileMethode2(5, 17);

        System.out.println("*************************#31");
        System.out.println(calculatorBMI());
    }

    public static int getMeMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int getMeMin(int a, int b) {
        int min = a < b ? a : b;
        return min;
    }

    public static String myFirstCompareTo(String str, String str2) {
        String result = str.charAt(0) < str2.charAt(0) ? str : str2;
        return result;
    }

    public static void whileMethode(int a, int b) {
        int count = 0;
        while (count < b) {
            System.out.print(a + ",");
            count++;
        }
        System.out.println();
    }

    public static void whileMethode2(int a, int b) {
        while (a <= b) {
            System.out.print(a++ + ",");
        }
        System.out.println();
    }

    public static String calculatorBMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your body weight in kilograms");
        int bodyWeight = scanner.nextInt();
        System.out.println("enter your height in centimeters");
        double temp = scanner.nextDouble();
        double height = temp / 100;

        return getAnswer(getBMI(height, bodyWeight));
    }

    public static double getBMI(double height, int weight) {
        return weight / (height * height);
    }

    public static String getAnswer(double indexBMI) {
        String result = "";
        if (indexBMI <= 16) {
            result = "Острый дефицит массы";
        } else if (indexBMI <= 18.5) {
            result = "Недостаточная масса тела";
        } else if (indexBMI <= 25) {
            result = "Норма";
        } else if (indexBMI <= 30) {
            result = "Избыточная масса тела";
        } else if (indexBMI <= 35) {
            result = "Ожирение первой степени";
        } else if (indexBMI <= 40) {
            result = "Ожирение второй степени";
        } else {
            result = "Ожирение третьей степени";
        }
        return result;
    }
}
