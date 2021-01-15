package lesson30;

public class Main {
    public static void main(String[] args) {
        Duck greyDuck = new Duck();
        greyDuck.age = 4;
        greyDuck.bred = "NASA";
        greyDuck.color = "grey";
        greyDuck.flies();
        greyDuck.eats();
        System.out.println(greyDuck.age);
    }
}
