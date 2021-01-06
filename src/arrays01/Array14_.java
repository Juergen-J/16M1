package arrays01;

import library.PrintArray;

public class Array14_ {
    public static void main(String[] args) {
        System.out.println("----------------#14");
        makeLast(new int[]{4, 5, 6});// → [0, 0, 0, 0, 0, 6]
        makeLast(new int[]{1, 2});// → [0, 0, 0, 2]
        makeLast(new int[]{3});// → [0, 3]
    }

    public static int[] makeLast(int[] array) {
        int[] result = new int[array.length * 2];
        result[result.length - 1] = array[array.length - 1];
        PrintArray.printIntArray(result);
        return result;
    }
}
