package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 단방향 Server
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept(); // 리스너
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

//            while 문으로 감싸줘야함
//            String msg = br.readLine();
//            System.out.println(msg);

            while (true) {
                String msg = br.readLine();

                if (msg == null) break;

                System.out.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
