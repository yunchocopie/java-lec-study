package ex04.example.model;

// 객체의 상태를 변경, 객체의 상태를 확인
public class Accout {
    private final int id; // 계좌 번호
    private long balance;
    private int userId;

    public boolean 잔액부족하니(long amount) {
        if (balance < amount) {
            return true;
        }
        return false;
    }

    // 메서드는 하나의 책임만 가진다.
    public void 출금(long amount) {
        this.balance -= amount;
    }

    public void 입금(long amount) {
        this.balance += amount;
    }

    public Accout(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Accout{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
