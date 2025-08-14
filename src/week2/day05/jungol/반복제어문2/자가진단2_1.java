package week2.day05.jungol.반복제어문2;
import java.util.*;

public class 자가진단2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = s.charAt(0);

        for(int i=0; i<20; i++){
            System.out.print(c);
        }
    }
}
