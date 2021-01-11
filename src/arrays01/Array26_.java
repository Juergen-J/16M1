package arrays01;

import com.sun.scenario.effect.impl.prism.PrImage;
import library.PrintArray;

import javax.management.relation.RelationSupport;

public class Array26_ {
    public static void main(String[] args) {
        System.out.println("*******************#26");
        frontPiece(new int[]{1, 2, 3});// → [1, 2]
        frontPiece(new int[]{1, 2});// → [1, 2]
        frontPiece(new int[]{1});// → [1]

        System.out.println("*******************#27");
        front11(new int[]{1, 2, 3}, new int[]{7, 9, 8});// → [1, 7]
        front11(new int[]{1}, new int[]{2});// → [1, 2]
        front11(new int[]{1, 7}, new int[0]);// → [1]
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
        PrintArray.printIntArray(result);
        return result;
    }

    public static int[] front11(int[] a, int[] b) {
        int length = a.length > 0 && b.length > 0 ? 2 : 1;
        int[] result = new int[length];
        if (length == 2) {
            result[0] = a[0];
            result[1] = b[0];
        } else if (a.length > 0) {
            result[0] = a[0];
        } else {
            result[0] = b[0];
        }
        PrintArray.printIntArray(result);
        return result;
    }
}
