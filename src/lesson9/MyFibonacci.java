package lesson9;

// красно-черное дерево
public class MyFibonacci {
    public static void main(String[] args) {
//        lineFibonacci(15);



    }

    public static void lineFibonacci(int numberHeight) {
        int lastNumber = 1;
        int firstNumber = 0;
        System.out.print(firstNumber + " " + lastNumber);
        for (int i = 0; i < numberHeight - 2; i++) {
            int answer = firstNumber + lastNumber;
            firstNumber = lastNumber;
            lastNumber = answer;

            System.out.print(" " + answer);
        }

    }




}
