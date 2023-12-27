package ex06.example7;

public class BurgerSet { // has Burger, Coke
    private Burger burger; // 컴퍼지션 코드 (상속 아닐 때 상태에 적기)
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거세트가 만들어졌어요");
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
