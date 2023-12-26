package ex07.example;

// 라이브러리 판매자
interface EventListener {
    void action();
}

// 라이브러리 판매자
class MyApp {
    public void click(EventListener l) {
        l.action();

    }
}


public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다."); // 구현체 안 만드는 방법
        });
    }
}
