package lesson22;

import library.PrintArray;

import java.util.Arrays;

public class ArrayExc {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 5, 10};
        int[] var2 = new int[]{6, 7, 9};

        arrayConcatenation(var1, var2);
        arrayElementSum(var1, var2);
    }

    public static int[] arrayConcatenation(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        for (int i = arr1.length; i < output.length; i++) {
            output[i] = arr2[i - arr1.length];
        }
        PrintArray.printIntArray(output);
        return output;
    }

    public static int[] arrayElementSum(int[] arr1, int[] arr2) {
        int[] output = new int[Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < output.length; i++) {
            output[i] = arr1[i] + arr2[i];
        }
        PrintArray.printIntArray(output);
        return output;
    }
}
