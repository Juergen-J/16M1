package lesson17;

public class Coverter {
    public static void main(String[] args) {
        System.out.println(converterDecimalToBinary(78));
        System.out.println(converterBinaryToDecimal("1001110"));


    }

    public static String converterDecimalToBinary(int decimal) {
        String output = "";
        String temp = "";
        int reminder = 0;

        while (decimal > 0) {
            reminder = decimal % 2;
            output = reminder + output;
            decimal /= 2;
        }
//        for (int i = temp.length(); i > 0; i--) {
//            output += temp.charAt(i - 1);
//        }
        return output;
    }

    public static int converterBinaryToDecimal(String binary) {
        int result = 0;

        return result;

    }

    public static int degreeOfTwo(int degree) {
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= 2;
        }
        return result;
    }
}

