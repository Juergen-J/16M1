package library;

public class Random {
    public static double getDoubleRandom(double min, double max) {
        double random = (Math.random() * (max - min) + min);
        random *= 100;
        int temp = (int) random;
        double output = temp;
        return output / 100;
    }
}
