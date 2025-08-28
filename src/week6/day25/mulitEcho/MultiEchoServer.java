package week6.day25.mulitEcho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {
    private static final int PORT = 50001;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    //여러 client 작업을 처리하기 위한 threadPool -> handling 가능
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);
    //연결된 client 수를 count하기 위한 final 변수 -> 동시에 여러 thread가 접근해도 데이터 충돌없이 안전하게 접근 가능
    //getAndIncrement() 또는 incrementAndGet() 같은 메서드 사용 가능

    public static void main(String[] args) {
        System.out.println("[Server] Starting on port " + PORT);

        // Ctrl+C 시 스레드 풀 정리
        //현재 실행중인 JVM을 가져와서 JVM이 정상 종료될 때 실행할 thread를 등록(hook)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();//thread pool 강제 종료 -> 자원 해제
        }));

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                int id = CLIENT_SEQ.getAndIncrement();
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());
                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            System.err.println("[Server] Error: " + e.getMessage());
        }
    }
    //runnable interface는 thread에서 실행할 작업을 정의하기 위한 interface, 람다식으로 작성 가능
    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");
                //greeting
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client #" + clientId + ": " + line);
                    //trim()은 앞뒤 공백을 제거하는 메소드
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }
                    // 받은 메시지를 그대로 돌려주는 에코
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client #" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client #" + clientId + " disconnected.");
            }
        }
    }
}