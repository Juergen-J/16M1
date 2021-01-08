package arrays01;

import library.PrintArray;

public class Array24_25 {
    public static void main(String[] args) {
        System.out.println("----------------#24");
        biggerTwo(new int[]{1, 2}, new int[]{3, 4});// → [3, 4]
        biggerTwo(new int[]{3, 4}, new int[]{1, 2});// → [3, 4]
        biggerTwo(new int[]{1, 1}, new int[]{1, 2});// → [1, 2]

        System.out.println("----------------#25");
        swapEnds(new int[]{1, 2, 3, 4});// → [4, 2, 3, 1]
        swapEnds(new int[]{1, 2, 3});// → [3, 2, 1]
        swapEnds(new int[]{8, 6, 7, 9, 5});// → [5, 6, 7, 9, 8]
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int[] result = new int[2];
        result = arraySum(a) > arraySum(b) ? a : b;
        PrintArray.printIntArray(result);
        return result;
    }

    public static int arraySum(int[] array) {
        return array[0] + array[1];
    }

    public static int[] swapEnds(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[array.length - 1];
        for (int i = 1; i < array.length - 1; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = array[0];
        PrintArray.printIntArray(result);
        return result;
    }
}
