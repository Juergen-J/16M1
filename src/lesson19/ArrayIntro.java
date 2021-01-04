package lesson19;

public class ArrayIntro {
    public static void main(String[] args) {
        //arrayDeclartion();
        //anotherExample();

        int[] myLovelyArr = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        for (int i = 0; i < myLovelyArr.length; i++) {
            System.out.println(myLovelyArr[i]);
        }

    }

    private static void anotherExample() {
        String[] array = new String[]{"Maga", "Med", "uschka", "Tura"};
        String gubi = "HG";
        String hm = "Vasa";

    }

    private static void arrayDeclartion() {
        int[] myArray = new int[10];
        int[] arr = new int[]{10, 15, 3, 4, 45, 9, 46};
        int allLength = arr.length;//7

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            System.out.println(a);
        }

    }

}
