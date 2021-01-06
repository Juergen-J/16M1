package lesson23;

import library.PrintArray;

public class HomeWork23 {
    public static void main(String[] args) {
        System.out.println("----------------#12");
        maxEnd3(new int[]{1, 2, 3});// → [3, 3, 3]
        maxEnd3(new int[]{11, 5, 9});// → [11, 11, 11]
        maxEnd3(new int[]{2, 11, 3});// → [3, 3, 3]

        System.out.println("----------------#13");
        makeEnds(new int[]{1, 2, 3});// → [1, 3]
        makeEnds(new int[]{1, 2, 3, 4});// → [1, 4]
        makeEnds(new int[]{7, 4, 6, 2});// → [7, 2]

        System.out.println("----------------#14");
        makeLast(new int[]{4, 5, 6});// → [0, 0, 0, 0, 0, 6]
        makeLast(new int[]{1, 2});// → [0, 0, 0, 2]
        makeLast(new int[]{3});// → [0, 3]
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

    public static int[] makeLast(int[] array) {
        int[] result = new int[array.length * 2];
        result[result.length - 1] = array[array.length - 1];
        PrintArray.printIntArray(result);
        return result;
    }
}
