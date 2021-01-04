package lesson5;
// 

public class HelloBoolean {
    public static void main(String[] args) {
        //helloBoolean();
        //magicGame();
        //magicGame2();

//        System.out.println(smartDepositBox(true, false)); ----------#1
//        System.out.println(smartDepositBox(false, true));
//        System.out.println(smartDepositBox(false, false));

//        smartDepositBoxVersionTwo(true, false);// -> false ----------#2
//        smartDepositBoxVersionTwo(false, true);// -> false
//        smartDepositBoxVersionTwo(false, false);// -> false
//        smartDepositBoxVersionTwo(true, true);// -> true

//        verySmartDepositBoxVersionThree(true,true,true); //true ----------#3
//        verySmartDepositBoxVersionThree(true,false,true); //true
//        verySmartDepositBoxVersionThree(true,false,false); //false
//        verySmartDepositBoxVersionThree(true,true,false); //true

//        bigBadaBoom(true, true).;// -> true -----------#4
//        bigBadaBoom(false, false);// -> false
//        bigBadaBoom(true, false);// -> false

//        doorbell(true, true).;// -> false ----------#5
//        doorbell(false, false);// -> false
//        doorbell(true, false);// -> true

//        smartDoorCheckKey(true,true); //true --------------#6
//        smartDoorCheckKey(true,false); //false --------------#6
//        smartDoorCheckKey(false,true); //false --------------#6
    }


    public static void helloBoolean() {
        boolean a = true;
        boolean b = false;

//        boolean c=a&&b; false
//        boolean c=a||b; true
//        boolean c=!a;  false
//        boolean c= a^b; true

    }

    public static void magicGame() {
        int a = 5;
        int b = 10;
        boolean c = a > b;// false
        boolean d = a <= b; // true
        boolean e = a >= b; //false

    }

    public static void magicGame2() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5; //true
        boolean b = (7 + 8) * 4 != 7 + 4 * 5; // true
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4; // false
        boolean d = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5; //true
        boolean e = !(3 * 4 < 7 + 8);//false
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama || papa;
    }

    public static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean grandmother) {
        return (mama && papa) || grandmother;
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
