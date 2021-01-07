package lesson24;

import library.PrintArray;

public class HomeWork24 {
    public static void main(String[] args) {
        System.out.println("----------------#16");
        plusTwo(new int[]{1, 2}, new int[]{3, 4});// → [1, 2, 3, 4]
        plusTwo(new int[]{4, 4}, new int[]{2, 2});// → [4, 4, 2, 2]
        plusTwo(new int[]{9, 2}, new int[]{3, 4});// → [9, 2, 3, 4]

        System.out.println("----------------#17");
        System.out.println(maxTriple(new int[]{1, 2, 3}));// → 3
        System.out.println(maxTriple(new int[]{1, 5, 3}));// → 5
        System.out.println(maxTriple(new int[]{5, 2, 3}));// → 5

        System.out.println("----------------#18");
        make2(new int[]{4, 5}, new int[]{1, 2, 3});// → [4, 5]
        make2(new int[]{4}, new int[]{1, 2, 3});// → [4, 1]
        make2(new int[0], new int[]{1, 2});// → [1, 2]
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
}
