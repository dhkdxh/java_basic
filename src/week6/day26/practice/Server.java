package week6.day26.practice;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)){

            Socket socket = serverSocket.accept();
            System.out.println("Server와 연결이 되었습니다.");

            System.out.println("서버와 연결 해제");
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
