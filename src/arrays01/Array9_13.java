package arrays01;

import library.PrintArray;

public class Array9_13 {
    public static void main(String[] args) {
        System.out.println("----------------#9");
        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));//true
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));//true
        System.out.println(unlucky1(new int[]{1, 1, 1, 1}));//false

        System.out.println("----------------#10");
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));// → false
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));// → true
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));// → true

        System.out.println("----------------#11");
        System.out.println(sum3(new int[]{1, 2, 3}));// → 6
        System.out.println(sum3(new int[]{5, 11, 2}));// → 18
        System.out.println(sum3(new int[]{7, 0, 0}));// → 7

        System.out.println("----------------#12");
        maxEnd3(new int[]{1, 2, 3});// → [3, 3, 3]
        maxEnd3(new int[]{11, 5, 9});// → [11, 11, 11]
        maxEnd3(new int[]{2, 11, 3});// → [3, 3, 3]

        System.out.println("----------------#13");
        makeEnds(new int[]{1, 2, 3});// → [1, 3]
        makeEnds(new int[]{1, 2, 3, 4});// → [1, 4]
        makeEnds(new int[]{7, 4, 6, 2});// → [7, 2]
    }

    public static boolean unlucky1(int[] array) {
        return (array[0] == 1 || array[1] == 1) ^ (array[array.length - 1] == 1 || array[array.length - 2] == 1);
    }

    public static boolean sameFirstLast(int[] array) {
        return array.length >= 1 && array[0] == array[array.length - 1];
    }

    public static int sum3(int[] array) {
        return array[0] + array[1] + array[2];
    }

    public static int[] maxEnd3(int[] array) {
        int[] result = new int[3];
        int maxElement = Math.max(array[0], array[2]);
        result[0] = maxElement;
        result[1] = maxElement;
        result[2] = maxElement;
        library.PrintArray.printIntArray(result);
        return result;
    }

    public static int[] makeEnds(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[array.length - 1];
        PrintArray.printIntArray(result);
        return result;
    }
}
