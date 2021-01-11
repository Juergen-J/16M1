package lesson5;

public class Homework5 {
    public static void main(String[] args) {
        bigBadaBoom(true, true);// -> true -----------#1
        bigBadaBoom(false, false);// -> false
        bigBadaBoom(true, false);// -> false

        doorbell(true, true);// -> false ----------#2
        doorbell(false, false);// -> false
        doorbell(true, false);// -> true

        smartDoorCheckKey(true, true); //true --------------#3 не совсем понятны условия задания
        smartDoorCheckKey(true, false); //false
        smartDoorCheckKey(false, true); //false
    }

    public static boolean bigBadaBoom(boolean captain1, boolean captain2) {
        return captain1 && captain2;
    }

    public static boolean doorbell(boolean button1, boolean button2) {
        return !(button1 == button2);
    }

    public static boolean smartDoorCheckKey(boolean internet, boolean powerNetwork) {
        return internet && powerNetwork;
    }
}
