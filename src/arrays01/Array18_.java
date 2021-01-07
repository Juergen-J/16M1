package arrays01;

import library.PrintArray;

import java.util.PrimitiveIterator;

public class Array18_ {
    public static void main(String[] args) {
        System.out.println("----------------#18");
        make2(new int[]{4, 5}, new int[]{1, 2, 3});// → [4, 5]
        make2(new int[]{4}, new int[]{1, 2, 3});// → [4, 1]
        make2(new int[0], new int[]{1, 2});// → [1, 2]
    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length == 0) {
            result[0] = b[0];
            result[1] = b[1];
        }
        if (a.length == 1) {
            result[0] = a[0];
            result[0] = b[0];
        }
        if (a.length > 1) {
            result[0] = a[0];
            result[1] = a[1];
        }
        PrintArray.printIntArray(result);
        return result;
    }
}
