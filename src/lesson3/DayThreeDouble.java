package lesson3;

public class DayThreeDouble {
    public static void main(String[] args) {
        helloDouble();
        helloFloat();
        intToDouble();
        math();
    }

    public static void helloDouble() {
        double d1 = 8.0;

    }

    public static void helloFloat() {
        float b = (float) 3.5;
        float a = 5.7F;
        float c = 0.5f;
    }

    public static void intToDouble() {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;    //2
        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5; //2.5
        double var7 = var1 / var2; //2.0
        double var8 = var1 / var4; //1.0
        //double in priority!!!


    }

    public static void math() {
        double d1 = 1.0;
        double d2 = 23456789.0;
        double d3 = d1 / d2;
        System.out.println(d3);  //4.263158098919677E-8

        double javaPi = Math.PI;
        final double PI = 3.14; // задает не изменяемую переменную
        final int MAX_TEMP = 16;

    }
}
