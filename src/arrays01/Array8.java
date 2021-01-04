package arrays01;

public class Array8 {
    public static void main(String[] args) {
        midThree(new int[]{1, 2, 3, 4, 5});// → [2, 3, 4]
        midThree(new int[]{8, 6, 7, 5, 3, 0, 9});// → [7, 5, 3]
        midThree(new int[]{1, 2, 3});// → [1, 2, 3]
    }

    public static void midThree(int[] array) {
        int[] result = new int[3];
        result[0] = array[array.length / 2 - 1];
        result[1] = array[array.length / 2];
        result[2] = array[array.length / 2 + 1];

        library.PrintArray.printIntArray(result);
        System.out.println();
    }
}
