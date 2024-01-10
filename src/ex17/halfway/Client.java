package ex17.halfway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 20000);

            // 버퍼 만들기 (request)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            pw.println("1");

            // 버퍼 만들기 (respond)
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String reponseMsg = br.readLine();
            System.out.println("서버로부터 받은 메세지 : " + reponseMsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
