package lesson4;

public class HalloChar {
    public static void main(String[] args) {
        halloChar();
    }

    public static void halloChar() {
        char number = 100;
        char octal = '\u039A';
        char euroSymbol = '€';
        char tabulator = '\t';
        System.out.println(number + " " + octal + " " + euroSymbol + "" + tabulator);
        int var='a'+'b'+'c';// 294 сложение порядковых номеров символов
    }
}
