package library;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        helloFriend(); //----------1

//        System.out.println(getAge());//--------2

        //-------------3 такая же как первая

//        strings();
    }

    public static void helloFriend() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?...");
        String firstname = scanner.nextLine();
        System.out.println("Hello " + firstname);
        System.out.println("What's your last name?...");
        String lastname = scanner.nextLine();
        System.out.println("how old are you?...");
        int age = scanner.nextInt();
        System.out.println("are you a girl, boy or diverse?...");
        String youGender = scanner.next();
        System.out.println();
        System.out.println("fill in your E-Mail...");
        String eMail = scanner.next();
        System.out.println(firstname + " " + lastname + "\n" + age + " years old, " + youGender + "\n" + eMail);
        System.out.println("it is you?...");
    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how old are you?...");
        int age = scanner.nextInt();
        return age;
    }

    public static void strings() {
        String subject = "Tel-Ran/2020";

        subject.charAt(5);// a
        subject.codePointAt(5); //97  показывает номер символа из 10-ой таблице а=97
        subject.codePointBefore(6);//97  показывает номер предыдущего символа из 10-ой таблице а=97
        subject.codePointCount(0, 13); //13 возвращает колиство значений Unicode в хзаданном диапазона
        subject.compareToIgnoreCase(subject);//0     сравнивает строки по unicode не учитывая регистр
        subject.concat(subject);//"Tel-Ran/2020Tel-Ran/2020"
        subject.contains("el");//true      проверяет, содержит ли строка последовательность символов
        subject.endsWith("21");//false      проверяет , заканчивается ли строка указанным символом(символами)
        subject.equals("Tel");// false   проверит строку на совместимость со значением
        subject.equalsIgnoreCase("TEL-rAn/2020");//true     сравнение строки без учета регистра
        subject.indexOf("Ran");//4      возвращает позицию первого вхождения указанного символа(ов) в строку
        subject.isEmpty();//false       проверяет, является ли строка пустой или нет, если пустая возвращает true
        subject.length();// 12    показывает количество символов в строке
        // replace(char oldChar, char newChar) с этим до конца не разобрался
        subject.startsWith("Tel-");//true        проверяет , начинается ли строка с указанного символа(символов)
        char[] array = subject.toCharArray();//преобразование строки в последовательность символов (массив)
        subject.toLowerCase();//tel-ran/2020     все внижний регистр
        subject.toUpperCase();// TEL-RAN/2020   все в верхний регистр
        subject.trim();//удаляет пробелы с обоих концов строки

    }
}