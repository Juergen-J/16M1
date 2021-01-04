package lesson9;

public class BooleanWork {
    public static void main(String[] args) {
//        cigarParty(30, false);// → false ------#1
//        cigarParty(50, false);// → true
//        cigarParty(70, true);// → true

//        System.out.println(caughtSpeeding(60, false));// → 0 ----------#2
//        System.out.println(caughtSpeeding(65, false));// → 1
//        System.out.println(caughtSpeeding(65, true));// → 0

//        love6(6, 4);// → true ----------------#3
//        love6(4, 5);// → false
//        love6(1, 5);// → true
//        love6(1, 7);// → true

    }

    public static void cigarParty(int cigars, boolean weekDay) {
        System.out.println(weekDay && cigars >= 40 || cigars >= 40 && cigars <= 60);

        //        if (weekDay) {
//            System.out.println(cigars >= 40);
//        } else {
//            System.out.println(cigars >= 40 && cigars <= 60);
//        }
    }  //1

    public static String caughtSpeeding(int speed, boolean birthday) {
        String ticket0 = "no ticket";
        String ticket1 = "small ticket";
        String ticket2 = "big ticket";
        String result = "";
        if (birthday) {
            if (speed <= 65) {
                result = ticket0;
            } else if (speed <= 85) {
                result = ticket1;
            } else {
                result = ticket2;
            }
        } else {
            if (speed <= 60) {
                result = ticket0;
            } else if (speed <= 80) {
                result = ticket1;
            } else {
                result = ticket2;
            }
        }
        return result;
    }  //2

    public static void love6(int num1, int num2) {
        if (num1 == 6 || num2 == 6) {
            System.out.println(true);
        } else {
            if ((num1 + num2) == 6 || Math.abs(num1 - num2) == 6) {
                System.out.println(true);

            } else {
                System.out.println(false);
            }
        }

        System.out.println(num1 == 6 || num2 == 6 || num1 + num2 == 6 || Math.abs(num1 - num2) == 6); //второй вариант

    }  //3


}
