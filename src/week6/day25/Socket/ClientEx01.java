package week6.day25.Socket;
import java.io.IOException;
import java.net.*;

public class ClientEx01 {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("Connected to server successfully!");

            socket.close();
            System.out.println("client 연결 종료");

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
