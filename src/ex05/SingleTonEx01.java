package ex05;

//객체지향이랑 상관없음
// static 이랑 똑같은데 (main 전에 한번만 뜨는 거) heap 에 뜨는 것만 다름
class President{

    static President instance = new President(); // main 실행 전에 뜸 (heap)

    private President() {}
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance; // 접근하는 것 뿐
        System.out.println(p1.hashCode()); // 메모리 주소

        President p2 = President.instance;
        System.out.println(p2.hashCode()); // 해쉬값 같음
    }
}
