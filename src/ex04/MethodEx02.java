package ex04;

public class MethodEx02 {

    static void m3(int n1) {
        System.out.println("m3 : " + n1);
    }

    static void m3(int n1, int n2) {
        System.out.println("m4 : " + n1);
        System.out.println("m4 : " + n2);
    }

    public static void main(String[] args) {
        m3(1);
        m3(2, 4); // argument (인수)
    }
}
