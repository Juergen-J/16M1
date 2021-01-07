package lesson24;

public class Varargs {
    public static void main(String[] args) {
        addition(2, 3, 6);
        int [] arr= new int [] {2,3,4,5};

        sum();
    }

    private static int sum(int... allDigits) {

        return 0;
    }

    public static int addition(int x, int y, int z) {

        return x + y + z;
    }

    public static int findArraySum(int[] array) {
        int sum=0;
        for (int element:array) {
            sum+=element;
        }
        return sum;
    }
}
