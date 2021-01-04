package lesson16;

public class Lesson16 {
    public static void main(String[] args) {
//        myRandom();
//        fourthMethod();

        myPasswort(15);
    }

    public static void myRandom() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Math.random());
        }
    }

    public static void fourthMethod() {

        String a = "az";
        System.out.println(a.codePointAt(0));
        System.out.println(a.codePointAt(1));

        for (int i = 0; i < 100; i++) {
            char myLovelyChar = (char) (Math.random() * (122 - 97) + 1 + 97);
            System.out.print(myLovelyChar);
        }

    }


    public static String myPasswort(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += giveMeChar('a', 'z');
        }

        return result;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myLovelyChar = (char) (Math.random() * (max - min) + 1 + min);
        result = String.valueOf(myLovelyChar);
        return result;
    }
}

