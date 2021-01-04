package arrays01;

public class Array4 {
    public static void main(String[] args) {
        middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});// → [2, 5]
        middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});// → [7, 8]
        middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});// → [2, 4]

        library.PrintArray.printIntArray(middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[]{average(a), average(b)};
        return result;
    }

    public static int average(int[] arr) {
        int temp = 0;
        for (int elemnt : arr) {
            temp += elemnt;
        }
        return temp / arr.length;
    }
}
