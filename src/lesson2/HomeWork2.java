package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        findSquare();
        findRechtangle();
        findCube();
        findChess();
    }

    public static void findSquare() {
        int a = 8;
        int S = a * a;
        int P = a * 4;
        System.out.println("Периметр квадрата 8*8: " + P);
        System.out.println("Площадь квадрата 8*8: " + S);

    }

    public static void findRechtangle() {
        int a = 10;
        int b = 5;
        int S = a * b;
        int P = (a + b) * 2;
        System.out.println("Площадь прямоугольника со сторонами 10 и 5: " + S);
        System.out.println("Периметр прямоугольника со сторонами 10 и 5: " + P);

    }

    public static void findCube() {
        int a = 8;
        int S = a * a * 6;
        int P = a * 12;
        System.out.println("Площадь куба со стороной 8: " + S);
        System.out.println("Периметр куба со стороной 8: " + P);
    }

    public static void findChess() {
        float a = 2;
        float b = 0f;
        b = a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a * a;
        System.out.println("Количтво зерен на доске: " + ((b * b) - 1));


    }
}
