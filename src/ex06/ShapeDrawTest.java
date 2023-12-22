package ex06;

class ShapeDraw {
    public void draw() {
        System.out.println("Shape 중 하나를 그릴 예정입니다.");
    }
}

class CircleShape extends ShapeDraw {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
    }



public class ShapeDrawTest {
    public static void main(String[] args) {
        CircleShape s = new CircleShape();
        s.draw();
    }
}
