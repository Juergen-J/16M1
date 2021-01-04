package arrays01;

public class Array2 {
    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 2, 3};
        int[] arr1 = new int[]{7, 3};
        int[] arr2 = new int[]{7, 3, 2};
        int[] arr3 = new int[]{1, 3};


        System.out.println(commonEnd(arr0, arr1));   //true
        System.out.println(commonEnd(arr0, arr2)); //false
        System.out.println(commonEnd(arr0, arr3));//true
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
