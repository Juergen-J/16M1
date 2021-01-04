package arrays01;

public class Array7 {
    public static void main(String[] args) {
        makeMiddle(new int[]{1, 2, 3, 4});// → [2, 3]
        makeMiddle(new int[]{7, 1, 2, 3, 4, 9});// → [2, 3]
        makeMiddle(new int[]{1, 2});// → [1, 2]
    }

    public static void makeMiddle(int[] array) {
        int[] result = new int[2];
        result[0] = array[array.length / 2 - 1];
        result[1] = array[array.length / 2];
        library.PrintArray.printIntArray(result);
        System.out.println();
    }
}
