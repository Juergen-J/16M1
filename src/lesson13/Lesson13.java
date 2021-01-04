package lesson13;

public class Lesson13 {
    public static void main(String[] args) {
//        System.out.println("Preis: " + energyCost(200) + " Euro"); //50  --#6 file2

    }

    public static double energyCost(double watt) {
        double result = 30.0;
        if (watt > 100) {
            result += (watt - 100) * 0.20;
        }
        return result;
    }


}
