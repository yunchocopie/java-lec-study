package ex06;

class Shape { // 부모를 메모리에 먼저 띄음
    int x, y;

    public Shape() {
        System.out.println("shape 생성됨");
    }
}

class Circle extends Shape {
    int radius; // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x = 0; // 부모가 먼저 떠야 사용 가능하기 때문
        super.y = 0;
    }

    double getArea() {
        return  3.14 * radius * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
    }
}
