package ex08.example;

class QueryString {
    private String username;
    private String password;

    public QueryString(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String username;
        String password;

        // ? 분리
        String first[] = url.split("\\?");

        // username=ssar&password=1234
        String queryString = first[1];

        // & 분리
        String second[] = queryString.split("&");

        // username과 password 나누기
        String un = second[0];
        String pw = second[1];

        // username = 분리
        String userName[] = un.split("=");

        // password = 분리
        String passWord[] = pw.split("=");

        // 객체 생성
        QueryString q1 = new QueryString(userName[1], passWord[1]);
        System.out.println(q1.getUsername());
        System.out.println(q1.getPassword());

    }
}