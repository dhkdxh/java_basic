package week3.day10;
import java.util.*;

public class Ex01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("사용자 아이디 입력");
        String id = sc.nextLine();
        System.out.println("사용자 비밀번호 입력");
        String pwd = sc.nextLine();

        idPwPrint(id,pwd);
    }

    public static void idPwPrint(String id, String pwd){
        System.out.println("id: "+ id);
        System.out.println("pwd: "+pwd);
    }
}
