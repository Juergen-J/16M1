package arrays01;

public class Array5 {
    public static void main(String[] args) {
        System.out.println(no23(new int[]{4, 5})); //true
        System.out.println(no23(new int[]{4, 2}));// → false
        System.out.println(no23(new int[]{3, 5})); //→ false
    }

    public static boolean no23(int[] array) {
        if (array[0] == 2 || array[0] == 3) {
            return false;
        }
        if (array[1] == 2 || array[1] == 3) {
            return false;
        }
        return true;
    }
}
