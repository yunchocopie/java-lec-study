package ex04;

import java.sql.SQLOutput;

class Cat {
    String name;

    Cat() {
        //this.name = "토비";
        this("토비"); // 아래 생성자가 쓰임
    }

    Cat(String name) {
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.name);
    }
}
