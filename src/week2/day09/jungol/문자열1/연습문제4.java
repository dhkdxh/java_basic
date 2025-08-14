package week2.day09.jungol.문자열1;
import java.util.*;

public class 연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", s.length());
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
