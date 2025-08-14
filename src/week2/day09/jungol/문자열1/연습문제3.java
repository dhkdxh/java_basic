package week2.day09.jungol.문자열1;
import java.util.*;

public class 연습문제3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "jungol olympiad";

        for(int i=0; i<5; i++){
            int index = sc.nextInt();
            System.out.print(s.charAt(index));
        }
    }
}
