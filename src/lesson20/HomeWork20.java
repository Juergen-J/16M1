package lesson20;

public class HomeWork20 {
    public static void main(String[] args) {
        System.out.println("-------------Rubli");
        printSumInRub(1, 100);

        System.out.println("----------cipher");
        System.out.println(cipherZesar("С наступающим Новым Годом", 3));

    }

    public static void printSumInRub(int a, int b) {
        String base = "рубл";
        for (int i = a; i <= b; i++) {
            if (i == 1 || i % 10 == 1 && checkEleven(i)) {
                System.out.println(i + " " + base + "ь");
            } else if (i > 1 && i < 5 || i % 10 > 1 && i % 10 < 5 && i > 20) {
                System.out.println(i + " " + base + "я");
            } else {
                System.out.println(i + " " + base + "ей");
            }
        }
    }

    public static boolean checkEleven(int eleven) {
        String temp = "" + eleven;
        if (eleven > 9) {
            return !temp.substring(temp.length() - 2).equalsIgnoreCase("11");
        }
        return true;
    }


    private static String cipherZesar(String original, int key) {
        String base = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String result = "";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ' || original.charAt(i) == '.' || original.charAt(i) == ',') {
                result += original.charAt(i);
            } else {
                int tempNum = getCharNumber(base, original.substring(i, i + 1));
                if (tempNum + key >= base.length()) {
                    tempNum += key - base.length();
                    result += base.substring(tempNum, tempNum + 1);
                } else {
                    tempNum += key;
                    result += base.substring(tempNum, tempNum + 1);
                }
            }
        }
        return result;
    }

    public static int getCharNumber(String base, String i) {
        int result = -30;
        for (int j = 0; j < base.length(); j++) {
            if (base.substring(j, j + 1).equalsIgnoreCase(i)) {
                result = j;
            }
        }
        return result;
    }
}
