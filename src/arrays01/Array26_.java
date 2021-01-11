package arrays01;

public class Array26_ {
    public static void main(String[] args) {
        System.out.println("*******************#26");
        frontPiece(new int[]{1, 2, 3});// → [1, 2]
        frontPiece(new int[]{1, 2});// → [1, 2]
        frontPiece(new int[]{1});// → [1]
    }

    public static int[] frontPiece(int[] array) {
        int length = array.length >= 2 ? 2 : array.length;
        int[] result = new int[length];
        if (length < 2) {
            result = array;
        } else {
            result[0] = array[0];
            result[1] = array[1];
        }
        return result;
    }
}
