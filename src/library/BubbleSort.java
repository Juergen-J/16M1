package library;

public class BubbleSort {
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
