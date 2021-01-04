package arrays01;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{5, 11, 9};
        int[] arr3 = new int[]{7, 0, 0};


        arrayPrint(reverse3(arr1));// → [3, 2, 1]
        reverse3(arr2);// → [9, 11, 5]
        reverse3(new int[]{7, 0, 0});// → [0, 0, 7]

    }

    public static int[] reverse3(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    public static void arrayPrint(int[] arr) {
        for (int element : arr) {
            System.out.print(element);
        }
    }
}
