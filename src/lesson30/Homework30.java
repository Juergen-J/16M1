package lesson30;

import library.PrintArray;

public class Homework30 {
    public static void main(String[] args) {
        createRandomDoubleArray(10);

    }

    public static double[] createRandomDoubleArray(int length) {
        double[] result = new double[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = library.Random.getDoubleRandom(1, 100);
        }
        PrintArray.printDoubleArray(result);
        return result;
    }

}
