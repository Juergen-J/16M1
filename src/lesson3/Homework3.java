package lesson3;

public class Homework3 {
    public static void main(String[] args) {
        final double PI = Math.PI;
        System.out.println("Circle Area: " + getCircleArea(10, PI));

        System.out.println("Length Circle:" + getLengthCircle(10, PI));

        System.out.println("1 Euro = " + convertEuroToDollar(1) + " Dollar");

        int squareBelarus = 207595;
        int squareUkraine = 603628;
        System.out.println("Belarus Square : " + squareBelarus + " Km^2");
        System.out.println("Ukraine Square : " + squareUkraine + " Km^2");
        System.out.println("Area Relation Belarus to Ukraine: " + getRelationArea(squareBelarus, squareUkraine));

        int squareMoscow = 2511;
        double squareBerlin = 891.8;
        System.out.println("Moscow Square : " + squareMoscow + " Km^2");
        System.out.println("Berlin Square : " + squareBerlin + " Km^2");
        System.out.println("Area Difference Moscow to Berlin: " + getDifferenceArea(squareMoscow, squareBerlin));

        int start = 1000;
        System.out.println("amount in seven years: " + getAmoutSumm(start) + " Euro"); //задание было бы намного легче сделать используя циклы и счетчики!

    }

    public static double getCircleArea(double r, double PI) {
        return PI * r * r;
    }

    public static double getLengthCircle(double r, double PI) {
        return 2 * PI * r;

    }

    public static double convertEuroToDollar(double e) {
        return e * 1.1;

    }

    public static double getRelationArea(double a, double b) {
        return b / a;

    }

    public static double getDifferenceArea(double a, double b) {
        return a - b;

    }

    public static double getAmoutSumm(int start) {
        double result1, result2, result3, result4, result5, result6, result7;
        result1 = start * 0.035 + start;
        result2 = result1 * 0.035 + result1;
        result3 = result2 * 0.035 + result2;
        result4 = result3 * 0.035 + result3;
        result5 = result4 * 0.035 + result4;
        result6 = result5 * 0.035 + result5;
        result7 = result6 * 0.035 + result6;
        return result7;
    }
}
