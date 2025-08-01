package day09.jungol;
import java.util.*;

public class 연습문제1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            char c = sc.nextLine().charAt(0);

            System.out.printf("%c -> %d\n", c, (int)c);

            if(c=='0') break;
        }
    }
}
