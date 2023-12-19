package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int resultAdd = cal.add(50, 80); // => 리턴값으로 바뀜 (130)
        int resultMinus = cal.minus(50, 80);
        int resultDivide = cal.divide(50, 25);
        int resultMulti = cal.multi(50, 80);

        System.out.println("add : " + resultAdd);
        System.out.println("minus : " + resultMinus);
        System.out.println("divide : " + resultDivide);
        System.out.println("multi : " + resultMulti);
    }
}
