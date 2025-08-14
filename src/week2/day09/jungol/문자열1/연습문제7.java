package week2.day09.jungol.문자열1;
import java.util.*;

public class 연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c>=65 && c<=90) c = Character.toLowerCase(c);
            else c = Character.toUpperCase(c);

            System.out.print(c);
        }
    }
}
