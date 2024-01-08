package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버퍼 만들기
public class StringEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // 타겟만 바꾸면됨 ()
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine(); // \n 까지만 읽음
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
