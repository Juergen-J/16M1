package lesson22;

public class Lesson22 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 8, 1, 3};
        int x = 99;

        library.PrintArray.printIntArray(insertFirstElement(arr, x));
        library.PrintArray.printIntArray(insertLastElement(arr, x));
    }

    public static int[] insertFirstElement(int[] input, int x) {
        int[] output = new int[input.length + 1];
        output[0] = x;
        for (int i = 1; i < output.length; i++) {
            output[i] = input[i - 1];
        }
        return output;
    }

    public static int[] insertLastElement(int[] input, int x) {
        int[] output = new int[input.length + 1];
        output[output.length - 1] = x;
        for (int i = 0; i < output.length - 1; i++) {
            output[i] = input[i];
        }
        return output;
    }
}
