package arrays01;

public class Array6 {
    public static void main(String[] args) {
        fix23(new int[]{1, 2, 3});// → [1, 2, 0]
        fix23(new int[]{2, 3, 5});// → [2, 0, 5]
        fix23(new int[]{1, 2, 1});// → [1, 2, 1]
    }

    public static void fix23(int[] arr) {
        if (arr[0] == 2 && arr[1] == 3) {
            arr[1] = 0;
        } else if (arr[1] == 2 && arr[2] == 3) {
            arr[2] = 0;
        }
        library.PrintArray.printIntArray(arr);
        System.out.println();
    }
}
