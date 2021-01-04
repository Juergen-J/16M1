package lesson21;

public class HomeWork21 {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        System.out.println(ANSI_RED + "Test1 [2, 3, 4]" + ANSI_RESET);
        midThree(new int[]{1, 2, 3, 4, 5});// → [2, 3, 4]
        System.out.println(ANSI_GREEN + "Test2 [7, 5, 3]");
        midThree(new int[]{8, 6, 7, 5, 3, 0, 9});// → [7, 5, 3]
        System.out.println(ANSI_BLACK_BACKGROUND + "Test3 [1, 2, 3]" + ANSI_RESET);
        midThree(new int[]{1, 2, 3});// → [1, 2, 3]
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_RED + "The end" + ANSI_RESET);
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
