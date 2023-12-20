package ex04;

// 설계도
public class Circle {
    private int radius;

    // 생성자 (생성될 때 무조건 실행되는 메소드)
    public Circle(int radius){ // (안 만들어도 자동 생성됨) 실행 직전에 static 안붙은거 메모리에 뜸
        this.radius = radius; // 초기화 코드
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}