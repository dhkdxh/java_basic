package day09.jungol.문자열2;
import java.util.*;

public class 연습문제5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       String s = sc.nextLine();
       String[] arr = s.split(" ");

       String answer="";
       for(int i=1; i>=0; i--){
           answer += arr[i];
       }
       System.out.println(answer);
    }
}
