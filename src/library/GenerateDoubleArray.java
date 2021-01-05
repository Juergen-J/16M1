package library;

public class GenerateDoubleArray {
    public static void main(String[] args) {

    }

    private static double[] generateDoubleArray() {
        double[] output = new double[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomNumber();
        }
        PrintArray.printDoubleArray(output);
        return output;
    }

    public static double randomNumber() {
        return Math.round(Math.random() * 100);
    }
}
