package ex04;

public class MethodEx01 {

    static void m1(){ // 반환 x
        System.out.println("m1 출력");
    }

    static String m2(){
        System.out.println("m2 출력");
        return "m2"; // 메서드 종료
    }


    public static void main(String[] args) {
        MethodEx01.m1(); // 클래스 이름 생략 가능
        //String result = "m2"; // = m2();
        String result = m2();

        System.out.println("result : " + m2());
    }
}
