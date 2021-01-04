package lesson9;

public class HomeWork9 {
    public static void main(String[] args) {
        System.out.println(more20(20));// → false
        System.out.println(more20(21));//→ true
        System.out.println(more20(22));// → true

        System.out.println(nearTen(12));// → true    --эта задача от части была решена с помощью Гугл т.к. через 15 минут разбора условия кончилось терпение
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true

    }

    public static boolean more20(int number) {
        return number > 0 && (number - 1) % 20 == 0 || (number - 2) % 20 == 0;
    }

    public static boolean nearTen(int num) {
        return (num % 10) <= 2 || (num % 10) >= 8;

    }
}
