package week6.day26.practice;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
       try( Socket socket = new Socket("localhost", 5000)){

           System.out.println("서버 연결 성공");

           socket.close();
           System.out.println("접속 해제");

       } catch (UnknownHostException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
