package lesson25;

public class HomeWork25 {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100
    }

    public static int getMeMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}
