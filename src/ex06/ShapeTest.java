package ex06;

class Shape2 {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }
}

class Recangle extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class Triangle extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Recangle r = new Recangle();
        r.draw();
    }
}
