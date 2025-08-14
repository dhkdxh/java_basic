package week2.day09.jungol.문자열1;
import java.util.*;

public class 형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        char c1 = s.charAt(0);
        char c2 = s.charAt(2);

        System.out.println((int)c1+(int)c2 + " "+ Math.abs((int)c1 - (int)c2));
    }
}
