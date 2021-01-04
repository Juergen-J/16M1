package lesson3;

public class Starter {
    public static void main(String[] args) {
        DayThreeDouble.intToDouble();
        addition(5, 8);
        addition(30, 150);
        int x = 0;
        int y = 22;
        addition(x, y);

        System.out.println(additionOne(4, 8));

    }

    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int additionOne(int a, int b) {
        return a + b;
    }


}
