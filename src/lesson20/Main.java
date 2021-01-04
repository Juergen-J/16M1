package lesson20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        printArr(array);
    }

    public static void printArr(int[] array) {
        for (int element : array) {
            System.out.print(element);
        }
    }
}
