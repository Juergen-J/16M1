package lesson30;

import library.PrintArray;

public class Homework30 {
    public static void main(String[] args) {
        double[] array = createRandomDoubleArray(10);
        bubbleSortDoubleArray(array);
    }

    public static double[] createRandomDoubleArray(int length) {
        double[] result = new double[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = library.Random.getDoubleRandom(1, 100);
        }
        PrintArray.printDoubleArray(result);
        return result;
    }

    public static double[] bubbleSortDoubleArray(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortDoubleArray(arr);
        }
        return arr;
    }

}
