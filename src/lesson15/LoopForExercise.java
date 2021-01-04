package lesson15;

public class LoopForExercise {
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

    public static int multiply2(int a, int b) {
        int result = 0;
        int count = 0;
        while (count < b) {
            result += a;
            count++;
        }
        return result;
    }

    public static int multiply3(int a, int b) {
        int result = 0;
        int count = 0;
        do {
            result += a;
        } while (count < b);
        return result;
    }

}
