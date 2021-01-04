package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
//        evenAB(10, 50);

        myColorPrint();
    }

    public static void evenAB(int a, int b) {
        while (a < b) {
            if (a % b == 0) {
                System.out.println(a);
            }
            a++;
        }
    }

    public static void myColorPrint() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";


        System.out.println(ANSI_GREEN + "Hello World" + ANSI_RESET);

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        System.out.println(ANSI_RED_BACKGROUND + "HELLO" + ANSI_RESET);
    }
}
