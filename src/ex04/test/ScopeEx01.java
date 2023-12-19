package ex04.test;

public class ScopeEx01 {
    int n1 = 1; // 힙에저장

    static int n2 = 2; // static 에 저장

    static void m1(){
        int n5 = 10; // 스택에 저장
        System.out.println("m1 : " + n5); // 10
    }

    void m2(){
        System.out.println("m2 : " + n1); // 1 힙 영역
    }

    // 메인 시작전에 static 에 n2 변수와 m1 메서드가 로드되어 있음.(이름만) 호출해야 문 열림
    public static void main(String[] args) {
        System.out.println(1);
        m1(); // m1 큐 열림 (메인큐 안 닫힌 상태에서)
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01(); // 힙 만들기 메인 스택에 만들어짐
        System.out.println(sc.n1);
        sc.m2();
    }
}
