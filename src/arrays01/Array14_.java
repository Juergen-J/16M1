package arrays01;

import library.PrintArray;

public class Array14_ {
    public static void main(String[] args) {
        System.out.println("----------------#14");
        makeLast(new int[]{4, 5, 6});// → [0, 0, 0, 0, 0, 6]
        makeLast(new int[]{1, 2});// → [0, 0, 0, 2]
        makeLast(new int[]{3});// → [0, 3]

        System.out.println("----------------#15");
        System.out.println(start1(new int[]{1, 2, 3}, new int[]{1, 3}));// →2
        System.out.println(start1(new int[]{7, 2, 3}, new int[]{1}));// →1
        System.out.println(start1(new int[]{1, 2}, new int[]{0}));//1
    }

    public static int[] makeLast(int[] array) {
        int[] result = new int[array.length * 2];
        result[result.length - 1] = array[array.length - 1];
        PrintArray.printIntArray(result);
        return result;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a[0] == 1) {
            count++;
        }
        if (b[0] == 1) {
            count++;
        }
        return count;
    }
}
