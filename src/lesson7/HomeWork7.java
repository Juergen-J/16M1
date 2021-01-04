package lesson7;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Speed...");
        System.out.println(checkSpeed(scanner.nextInt())); //за превышение скорости от 16 км/час — 40 евро штрафа; ???

        System.out.println("Where will you go, Vitjaz?");
        System.out.println("1. Left");
        System.out.println("2. Direct");
        System.out.println("3. Right");
        System.out.println(chooseDirection(scanner.nextInt()));

    }

    public static String checkSpeed(int speed) {
        String answer = "";

        if (speed <= 50) {
            answer = "нарушений нет";
        } else if (speed <= 65) {
            answer = "устное порицание и лекция на 5 минут";
        } else if (speed <= 100) {
            answer = "40 евро штрафа";
        } else if (speed <= 130) {
            answer = "штраф 500 евро";
        } else {
            answer = "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
        return answer;

    }

    public static String chooseDirection(int direction) {

        if (direction == 1) {
            return "налеву ехати — богату быти";
        } else if (direction == 2) {
            return "Как пряму ехати — живу не бывати — нет пути ни прохожему, ни проезжему, ни пролетному";
        } else if (direction == 3) {
            return "направу ехати — женату быти";
        } else {
            return "данные были введены не корректно";
        }

    }
}
