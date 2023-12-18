package ex04;


class Person4 {
    // 상태 = 변수
    private int weight = 100; // private : 다른 클래스 접근 불가능

    // 메서드를 통해 간접적으로 접근 행위는 아님 (확인값)
    public int getWeight(){
        return weight;
    }

    // 행위 = 메서드
    public void exercise(){
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();

        for (int i = 0; i < 10; i++)
            p4.exercise();

        System.out.println("p3의 몸무게 : " + p4.getWeight());

    }
}