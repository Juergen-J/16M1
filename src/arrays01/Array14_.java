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

        System.out.println("----------------#16");
        plusTwo(new int[]{1, 2}, new int[]{3, 4});// → [1, 2, 3, 4]
        plusTwo(new int[]{4, 4}, new int[]{2, 2});// → [4, 4, 2, 2]
        plusTwo(new int[]{9, 2}, new int[]{3, 4});// → [9, 2, 3, 4]

        System.out.println("----------------#17");
        System.out.println(maxTriple(new int[]{1, 2, 3}));// → 3
        System.out.println(maxTriple(new int[]{1, 5, 3}));// → 5
        System.out.println(maxTriple(new int[]{5, 2, 3}));// → 5



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

    public static int[] plusTwo(int[] array1, int[] array2) {
        int[] result = new int[4];
        for (int i = 0; i < 2; i++) {
            result[i] = array1[i];
        }
        for (int i = 2; i < 4;
             i++) {
            result[i] = array2[i - 2];
        }
        PrintArray.printIntArray(result);
        return result;
    }

    public static int maxTriple(int[] array) {
        int tempAC = Math.max(array[0], array[array.length - 1]);
        int tempAB = Math.max(array[0], array[array.length / 2]);
        return Math.max(tempAB, tempAC);
    }
}
