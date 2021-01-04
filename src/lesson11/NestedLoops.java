package lesson11;

public class NestedLoops {
    public static void main(String[] args) {
//        rectangle(5, 7); // #1

//        threeUnknown(36);//#2

//        chessBoard();//#3

//        multiplicationTable(); //#4

//        triangle();  //#5
//        triangle2();
//        triangle3();
//        triangle4();
//        diamond();

//        numberTriangle(); //#6
//        numberTriangle2(); -------------------дорешать
//        floydsTriangle();

//        makeSnowflake(10); //-----#7   работает с любыми четными числами

    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void threeUnknown(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for (int k = 1; k <= number; k++) {
                    if (i * j * k == 36 && i <= j && j <= k) {
                        System.out.println("x:" + i + ", y:" + j + ", z:" + k);
                    }
                }
            }
        }
    }

    public static void chessBoard() {
        String temp0 = "_";
        String temp1 = "*";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                temp0 = "*";
                temp1 = "_";
            } else {
                temp0 = "_";
                temp1 = "*";
            }
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0) {
                    System.out.print(temp0);
                } else {
                    System.out.print(temp1);
                }
            }
            System.out.println();
        }
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            if (i > 9) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + "  ");
            }
            for (int j = 2; j <= 10; j++) {
                if (i * j > 9) {
                    System.out.print(i * j + " ");
                } else {
                    System.out.print(i * j + "  ");
                }
            }
            System.out.println();

        }
    }


    public static void triangle() {
        String temp = "";
        for (int i = 0; i < 10; i++) {
            temp += "*";
            System.out.println(temp);
        }
    }

    public static void triangle2() {
        int a = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");

            }
            System.out.println();
            a--;
        }
    }

    public static void triangle3() {
        for (int i = 0; i < 13; i++) {
            if (i != 13) {
                for (int k = 0; k < 13 - i; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("**");

            }
            System.out.println();
        }
    }

    public static void triangle4() {
        for (int i = 13; i > 0; i--) {
            if (i != 13) {
                for (int k = 0; k < 13 - i; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("**");

            }
            System.out.println();
        }
    }

    public static void diamond() {
        for (int i = 0; i < 7; i++) {
            if (i != 7) {
                for (int k = 0; k < 7 - i; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("**");

            }
            System.out.println();
        }
        for (int i = 7; i > 0; i--) {
            if (i != 7) {
                for (int k = 0; k < 7 - i; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("**");

            }
            System.out.println();
        }

    }


    public static void numberTriangle() {
        int temp = 0;
        for (int i = 1; i <= 6; i++) {
            if (i != 6) {
                for (int k = 0; k < 13 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + temp; j++) {
                    System.out.print(i);
                }
                temp++;
                System.out.println();
            }
        }
    }

    public static void numberTriangle2() {
        int temp = 0;
        for (int i = 1; i <= 6; i++) {
            if (i != 6) {
                for (int k = 0; k < 13 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i + temp; j++) {
                    System.out.print(j);
                }
                temp++;
                System.out.println();
            }
        }
    }

    public static void floydsTriangle() {
        int temp = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }


    public static void makeSnowflake(int size) {
        String temp = "";
        for (int i = 0; i <= size; i++) {
            if (i < size / 2) { //верх
                for (int j = 0; j <= size; j++) {
                    if (j < size / 2) { //верх-лево
                        if (i == j) {
                            System.out.print("X ");
                        } else {
                            System.out.print("  ");
                        }
                    } else if (j == size / 2) { //верх-середина
                        System.out.print("X ");
                    } else {//верх-право
                        if (i + j == size) {
                            System.out.print("X ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            } else if (i == size / 2) {
                for (int k = 0; k <= size; k++) {
                    System.out.print("X ");
                }
                System.out.println();
            } else {//низ
                for (int j = 0; j <= size; j++) {
                    if (j < size / 2) { //низ-лево
                        if (i + j == size) {
                            System.out.print("X ");
                        } else {
                            System.out.print("  ");
                        }
                    } else if (j == size / 2) { //низ-середина
                        System.out.print("X ");
                    } else {//низ-право
                        if (i == j) {
                            System.out.print("X ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
