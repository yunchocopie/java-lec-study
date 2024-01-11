package ex17.multiway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    private static Socket socket; // 소켓을 인스턴스 변수로 선언

    // 버퍼 만들기(send) 키보드 입력 + 입력받은 값 출력 스레드
    public static synchronized void serverBwThread() {
        try {
            while (true) {
                // 스캐너로부터 입력 받기
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String serverRequestMsg = br.readLine();

                // 입력값을 출력
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                pw.println(serverRequestMsg); // 입력값을 클라이언트에게 전송
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 버퍼 만들기(recieved)
    public static void serverBrThread() {
        try {
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientRequestMsg = br.readLine();
                System.out.println("클라이언트로부터 받은 메세지: " + clientRequestMsg);
            }
        } catch (SocketException e) {
            if ("Connection reset".equals(e.getMessage())) {
                System.out.println();
                System.out.println("Client가 퇴장하였습니다.");
            } else {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            // 소켓 연결
            ServerSocket serverSocket = new ServerSocket(30000);
            socket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 스레드 t1 - 서버가 클라이언트한테 보내기
        Thread t1 = new Thread(() -> {
            serverBwThread();
        });

        // 스레드 t2 - 클라이언트가 보낸거 읽기
        Thread t2 = new Thread(() -> {
            serverBrThread();
        });

        t1.start();
        t2.start();

    }
}