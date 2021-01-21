package lesson30;

import library.PrintArray;

public class Homework30 {
    public static void main(String[] args) {
        double[] array = createRandomDoubleArray(10);
        bubbleSortDoubleArray(array);
        addElementDoubleArray(array, 5, 3.14);
        deleteElementDoubleArray(array, 3);

    }

    public static double[] createRandomDoubleArray(int length) {
        double[] result = new double[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = library.Random.getDoubleRandom(1, 100);
        }
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

    public static double[] addElementDoubleArray(double[] array, int index, double element) {
        double[] output = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = array[i - 1];
        }
        PrintArray.printDoubleArray(output);
        return output;
    }

    private static double[] deleteElementDoubleArray(double[] array, int index) {
        double[] output = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        for (int i = index + 1; i <= output.length; i++) {
            output[i - 1] = array[i];
        }
        return output;
    }

}
