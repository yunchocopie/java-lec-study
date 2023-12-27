package ex08;

class Account extends Object {
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

//    @Override
//    public String toString() {
//        return "안녕"; // 객체의 상태값 적음
//    }

    @Override
    public String toString() { // Object 가 들고 있는 메서드 재정의
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);

        System.out.println(account);
        System.out.println(account.getClass()); // 어떤 클레스로 생성되었는지
        System.out.println(account.hashCode()); // 해쉬코드 - 메모리를 검증할 때

        // 메모리 값, 주소 비교
        if (account == account2) {
            System.out.println("같다");
        }

        // account -> equals() (오브젝트) (주소비교)
        // account.toString -> equals() (주소비교 and 값 비교)
        if (account.toString().equals(account2.toString())) {
            System.out.println("같다");
        }
    }
}
