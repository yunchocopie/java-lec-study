package ex04;


class Person3 {
    int weight = 100;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게 : " + p3.weight);

        p3.weight = 60; // 협업할 때 안 좋음 행위 없이 값 변경됨 -> 객체 지향 프로그램 x (문법적으로는 맞음)
        System.out.println("p3의 몸무게 : " + p3.weight);
    }
}