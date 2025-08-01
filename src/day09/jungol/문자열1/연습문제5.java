package day09.jungol.문자열1;
import java.util.*;

public class 연습문제5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "우리나라 대한민국!";
        String s1 = "위 문자열의 길이는 ?입니다.";

        System.out.println(s);
        System.out.printf("위 문자열의 길이는 %d입니다.\n", s.length()+s1.length());
    }
}
