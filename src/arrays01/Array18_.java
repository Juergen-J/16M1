package arrays01;

import library.PrintArray;

import java.util.PrimitiveIterator;

public class Array18_ {
    public static void main(String[] args) {
        System.out.println("----------------#18");
        make2(new int[]{4, 5}, new int[]{1, 2, 3});// → [4, 5]
        make2(new int[]{4}, new int[]{1, 2, 3});// → [4, 1]
        make2(new int[0], new int[]{1, 2});// → [1, 2]

        System.out.println("----------------#19");
        makePi();// → [3, 1, 4]

        System.out.println("----------------#20");
        rotateLeft3(new int[]{1, 2, 3});// → [2, 3, 1]
        rotateLeft3(new int[]{5, 11, 9});// → [11, 9, 5]
        rotateLeft3(new int[]{7, 0, 0});// → [0, 0, 7]

        System.out.println("----------------#21");
        System.out.println(sum2(new int[]{1, 2, 3}));// →3
        System.out.println(sum2(new int[]{1, 1}));// →2
        System.out.println(sum2(new int[]{1, 1, 1, 1}));// →2

        System.out.println("----------------#22");


    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length == 0) {
            result[0] = b[0];
            result[1] = b[1];
        }
        if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        }
        if (a.length > 1) {
            result[0] = a[0];
            result[1] = a[1];
        }
        PrintArray.printIntArray(result);
        return result;
    }

    public static int[] makePi() {
        int[] result = new int[3];
        int pi = (int) (Math.PI * 100);
        result[0] = pi / 100;
        pi %= 100;
        result[1] = pi / 10;
        pi %= 10;
        result[2] = pi;
        PrintArray.printIntArray(result);
        return result;
    }

    public static int[] rotateLeft3(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = array[i + 1];
        }
        result[result.length - 1] = array[0];
        PrintArray.printIntArray(result);
        return result;
    }

    public static int sum2(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            return array[0] + array[1];
        }
    }
}
