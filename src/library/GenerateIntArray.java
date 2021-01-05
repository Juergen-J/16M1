package library;

import library.PrintArray;

public class GenerateIntArray {
    public static void main(String[] args) {
        int[] array = generateIntArray();
        PrintArray.printIntArray(array);
    }

    private static int[] generateIntArray() {
        int randomLength = randomNumber();
        int[] output = new int[randomLength];

        for (int i = 0; i < output.length; i++) {
            output[i] = randomNumber();
        }
        return output;
    }

    public static int randomNumber() {
        return (int) (Math.random() * (50 - 1) + 1 + 1);
    }
}
