package ex04.example;

import ex04.example.model.Accout;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User yun = new User(1, "yun", "yunnn687@naver.com");
        User min = new User(2, "min", "min@gmail.com");
        User love = new User(3, "love", "love@gmail.com");

        // 2. 계좌 2개 만들기
        Accout yunAccount = new Accout(1111, 1000L, 1);
        Accout minAccount = new Accout(2222, 1000L, 2);
        Accout loveAccount = new Accout(3333, 1000L, 3);

        // 3. 고객에게 정보 받기 (sender, receiver, amount)
        long amount = 100L;
        // int sender = 1111;
        // int receiver = 2222;

        // 4. 이체 (yun -> min 100원)
        BankService.이체(yunAccount, minAccount, amount);

        // 5. 이체 (yun -> love 100원)
        BankService.이체(yunAccount, loveAccount, amount);

        // 6. 이체 (min -> love 100원)
        BankService.이체(minAccount, loveAccount, amount);

        //7. 객체 상태 확인
        System.out.println(yunAccount);
        System.out.println(minAccount);
        System.out.println(loveAccount);

        // 8. 출금
        BankService.출금(loveAccount, amount);
    }
}
