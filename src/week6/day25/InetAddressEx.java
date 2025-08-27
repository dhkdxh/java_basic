package week6.day25;

import java.net.*;
//자신의 컴퓨터 IP주소를 얻어내는 방법
public class InetAddressEx {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = null;
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP주소값 " + inetAddress);

            InetAddress[] iaAddress = InetAddress.getAllByName("www.naver.com");
            for (InetAddress address : iaAddress) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
