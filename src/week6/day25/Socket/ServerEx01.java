package week6.day25.Socket;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ServerEx01 {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---Starting Server Socket---");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하세요.");

        //TCP 서버 시작
        startServer();

        //키보드 입력을 받을 수 있는
        Scanner scanner  = new Scanner(System.in);
        while(true) {
            String key = scanner.next();
            if(key.toUpperCase().equals("Q")) {
                break;
            }
        }
        //TCP 서버를 종료
        stopServer();
    }

    public static void startServer() {
        //메인 자체가 thread인데, thread를 하나 더 만들 것이기 때문에 multithread임
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버 시작]");
                    while(true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");

                        Socket socket = serverSocket.accept();

                        //연결된 client의 ip 정보를 얻어내기
                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + ia.getAddress() + ":" + ia.getPort());

                        //연결 끊기
                        socket.close();
                        System.out.println("[서버] 연결 종료");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
