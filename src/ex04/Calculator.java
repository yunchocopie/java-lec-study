package ex04;

// 계산기
// add, minus, divide, multi
public class Calculator {

    public int add(int n1, int n2) { // static 없어서 new 하기
        return n1 + n2;
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }
}
