package lesson8;

//синтаксический сахар - сокращение которое позволяет писать меньше кода
//инкриминтация
public class HelloFor {
    public static void main(String[] args) {
//        helloFor();
//        example1();

//        sternPyramid();
//        squareNumbers(6);

        degreeOfNumberFromNumber(2, 0);    // 1 - число возводимое в степень. 2 - степень
        degreeOfNumberFromNumber(2, 1);
        degreeOfNumberFromNumber(2, 2);
        degreeOfNumberFromNumber(2, 3);
        degreeOfNumberFromNumber(2, 4);
        degreeOfNumberFromNumber(2, 5);
        degreeOfNumberFromNumber(2, 6);
//        degreeTwo(6);
//        degreeThree(5);
    }

    public static void helloFor() {
        int weekDays = 7;

        for (int i = 0; i < weekDays; i++) {  //loop
            System.out.println("Ich wache um 5.00 Uhr auf");
            System.out.println("Ich fruehstuecke");
            System.out.println("Gehe zur Arbeit");
            System.out.println("Zuruck");
            System.out.println("Abendessen");
            System.out.println("Code");
            System.out.println("Schlafe");

        }

    }

    public static void example1() {
        int a = 3;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        System.out.println(a); //13
    }

    public static void sternPyramid() {
        String pyramid = "";

        for (int i = 0; i < 10; i++) {
            pyramid += "*";
            System.out.println(pyramid);
        }
    }

    public static void squareNumbers(int n) {
        int min = 1;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < min; j++) {
                temp += min;
            }

            System.out.println(temp);
            min++;
        }

    }


    public static void degreeOfNumberFromNumber(int number, int degree) {
        if (degree == 0) {
            System.out.println(1);
        } else if (degree == 1) {
            System.out.println(number);
        } else if (degree % 2 == 0) {
            if (degree / 2 != 1) {
                int x = degree / 2;
                for (int i = 0; i < x / 2; i++) {
                    number = degreeTwo(number); ////////////////раьотает только с числами которые не делятся на 3
                }
                System.out.println(number);
            } else {
                System.out.println(degreeTwo(number));
            }
        } else {
            if (degree / 3 != 1) {
                for (int i = 0; i < degree / 3; i++) {
//????????????????????????????
                }
            } else {
                System.out.println(degreeThree(number));
            }

        }
    }

    public static int degreeTwo(int number) {
        int temp = 0;

        for (int j = 0; j < number; j++) {
            temp += number;
        }
        //System.out.println(temp);
        return temp;
    } // возводит любое число во 2 степень

    public static int degreeThree(int number) {
        int temp = 0;

        for (int j = 0; j < number; j++) {
            temp += number;
        }
        //System.out.println(temp);
        int temp2 = temp;
        for (int j = 0; j < number - 1; j++) {
            temp2 += temp;
        }
//        System.out.println(temp2);
        return temp2;

    } // возводит любое число в 3 степень

}

