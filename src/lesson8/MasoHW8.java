package lesson8;

public class MasoHW8 {
    public static void main(String[] args) {
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
                    number = degreeTwo(number); //
                }
                System.out.println(number);
            } else {
                System.out.println(degreeTwo(number));
            }
        } else {
            if (degree / 3 != 1) {
                for (int i = 0; i < degree / 3; i++) {
//??????????????????????????????????? //здесь не знаю что писать

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


