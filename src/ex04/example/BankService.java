package ex04.example;

import ex04.example.model.Accout;

//트랜잭션 관리
public class BankService {

    public static void 출금(Accout withdrawAccount, long amount) {
        if (amount <= 0) { //객체 상태확인 아니라서 Account에 넣을 수 없음
            System.out.println("0원 이하 금액을 출금 할 수 없습니다.");
            return;
        }
        if (withdrawAccount.잔액부족하니(amount)) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        withdrawAccount.출금(amount);
    }

    public static void 이체(Accout senderAccount, Accout receiverAccount, long amount) {
        if (amount <= 0) { //객체 상태확인 아니라서 Account에 넣을 수 없음
            System.out.println("0원 이하 금액을 이체를 할 수 없습니다.");
            return;
        }

        if (senderAccount.잔액부족하니(amount)) {
            System.out.println("잔액이 부족합니다.");
            return;

        }

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
