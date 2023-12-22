package ex06;

import ex06.example4.Dark;

class DrawShape {
    protected int x, y;

    public void draw() {
        System.out.println("Draw Shape");
    }
}

class Rectangle extends DrawShape {
    private  int base, height;
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Star extends DrawShape {
    private  int base, height;
    @Override
    public void draw() {
        System.out.println("Draw Star");
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        DrawShape s1 = new DrawShape();
        DrawShape s2 = new Rectangle();

        s2.draw();
    }
}
