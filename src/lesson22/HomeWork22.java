package lesson22;

import library.PrintArray;

public class HomeWork22 {
    public static void main(String[] args) {
        double[] array = generateDoubleArray();

        array = addElement(array, 33.33, 2);
        array = updateElement(array, 66.00, 10);
        array = deleteElement(array, 5);

        printDoubleArray(array);


    }

    private static double[] generateDoubleArray() {
        double[] output = new double[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomNumber();
        }
        return output;
    }

    public static double randomNumber() {
        double randomNumber = Math.random() * 10000;
        int temp = (int) (randomNumber);
        double temp2 = temp;
        return temp2 / 100;
    }

    public static double[] addElement(double[] array, double element, int index) {
        double[] output = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = array[i - 1];
        }
        return output;
    }

    public static double[] updateElement(double[] array, double element, int index) {
        double[] output = array;
        for (int i = 0; i < output.length; i++) {
            if (i == index) {
                output[i] = element;
            }
        }
        return output;
    }

    private static double[] deleteElement(double[] array, int index) {
        double[] output = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        for (int i = index + 1; i <= output.length; i++) {
            output[i - 1] = array[i];
        }
        return output;
    }

    public static void printDoubleArray(double[] array) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";

        System.out.print(ANSI_RED + "[" + ANSI_RESET);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(ANSI_GREEN + array[i] + ANSI_BLACK + ", ");
        }
        System.out.println(ANSI_GREEN + array[array.length - 1] + ANSI_RED + "]");
    }
}

