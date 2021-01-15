package lesson30;

public class Duck {
    String name;
    String bred;
    int age;
    String color;
    int rangeAge;

    void quacks() {
        System.out.println("Duck quacks");
    }

    void eats() {
        System.out.println("Duck eats");
    }

    void swims(int meter) {
        System.out.println(name + " Duck swims");
        rangeAge += meter;
    }

    void flies() {
        System.out.println("I can fly");
        System.out.println("I fly");
    }
}

class DuckTest {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.name = "Donald";

        Duck daisy = new Duck();
        daisy.name = "Daisy";
        daisy.swims(100);

        System.out.println("Total: " + daisy.rangeAge);

        Duck[] duckArr = new Duck[]{donald, daisy};
        System.out.println(duckArr[0].name);


    }

}
