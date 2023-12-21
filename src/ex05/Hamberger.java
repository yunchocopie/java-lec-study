package ex05;

public class Hamberger {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Hamberger(String toppings) {
        this.toppings = toppings;
        count++;
    }
}
