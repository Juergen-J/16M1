package arrays01;

import library.PrintArray;

public class Array24_ {
    public static void main(String[] args) {
        System.out.println("----------------#24");
        biggerTwo(new int[]{1, 2}, new int[]{3, 4});// → [3, 4]
        biggerTwo(new int[]{3, 4}, new int[]{1, 2});// → [3, 4]
        biggerTwo(new int[]{1, 1}, new int[]{1, 2});// → [1, 2]
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
}
