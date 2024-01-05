package ex14.example1;

import java.time.LocalDateTime;
import java.util.Arrays;

//Data Transfer Object
class JoinDTO{
    private String username; //ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Member{
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 회원가입 된 시간

    public Member(int no, JoinDTO joinDTO) {
        this.no = no;
        this.username = joinDTO.getUsername();
        this.password = joinDTO.getPassword();
        this.email = joinDTO.getEmail();
        this.createdAt = LocalDateTime.now();;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

//        현재 시간
//        LocalDateTime now = LocalDateTime.now();
//        now.plusDays(1);
//        System.out.println(now);

        Member m1 = new Member(1, d1);
        System.out.println(m1);

        Member m2 = new Member(2, d2);
        System.out.println(m2);
    }
}