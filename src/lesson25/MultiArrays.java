package lesson25;

public class MultiArrays {
    public static void main(String[] args) {
        int[][][][] myArray = new int[5][][][];
        //intro();
        //intro2();
        intro3();
    }

    public static void intro() {
        String[][] myArray = new String[3][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Max";
        myArray[0][2] = "#0321456";

        myArray[1][0] = "2";
        myArray[1][1] = "Nick";
        myArray[1][2] = "#55555";

        myArray[2][0] = "3";
        myArray[2][1] = "Rick";
        myArray[2][2] = "#789456";
        printTwoArray(myArray);
    }

    public static void intro2() {
        int[][][] arr = new int[5][10][15];
        int[] testArray = {0, 1, 2, 3};
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8}
                },
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8}
                }
        };
    }

    public static void intro3() {
        int[][] var = new int[3][];
        var[0] = new int[1];
        var[1] = new int[2];
        var[2] = new int[3];
        for (int[] arr : var) {
            for (int element : arr) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static void printTwoArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
