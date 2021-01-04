package arrays01;

public class Array1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 6};
        int[] array2 = new int[]{6, 1, 2, 3};
        int[] array3 = new int[]{13, 6, 1, 2, 3};

        System.out.println(firstLast6(array1));     //true
        System.out.println(firstLast6(array2));     //true
        System.out.println(firstLast6(array3));     //false
    }

    public static boolean firstLast6(int[] array) {
        return array[0] == 6 || array[array.length - 1] == 6;
    }
}
