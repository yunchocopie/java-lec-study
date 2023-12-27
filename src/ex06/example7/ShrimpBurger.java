package ex06.example7;

public class ShrimpBurger extends Burger {
    private String material; // 재료

    public ShrimpBurger(String name, int price, String material) {
        super(name, price); // Burger에 기본 생성자 없어서 안 적으면 오류
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
