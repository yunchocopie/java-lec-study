package ex05;

public class HambergerTest {
    public static void main(String[] args) {
        Hamberger h1 = new Hamberger("Super Supreme");
        Hamberger h2 = new Hamberger("Cheese");
        Hamberger h3 = new Hamberger("Pepperoni");

        int n = Hamberger.count;
        System.out.println("지금까지 판매된 햄배거 개수 : " + n);

    }
}
