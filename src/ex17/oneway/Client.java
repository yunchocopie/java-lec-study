package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

// 단방향 Client
public class Client {
    public static void main(String[] args) {
        // localhost = 127.0.0.1 (루프백)
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();

            // 가나다라abc - 15byte // UTF-8 설정 안 하면 한글 깨짐
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));

//            bw.write(msg + "\n"); // 스캐너 쓸 때
            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 자세하게 보기
        }
    }
}
