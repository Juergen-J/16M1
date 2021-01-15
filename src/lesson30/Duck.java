package lesson30;

public class Duck {
    String bred;
    int age;
    String color;

    void quacks() {
        System.out.println("Duck quacks");
    }

    void eats() {
        System.out.println("Duck eats");
    }

    void swims() {
        System.out.println("Duck swims");
    }

    void flies() {
        System.out.println("I can fly");
        System.out.println("I fly");
    }
}

class DuckTest {
    public static void main(String[] args) {
        Duck donald= new Duck();
        Duck daisy= new Duck();


        Duck[] duckArr= new Duck[]{donald,daisy};
    }

}
