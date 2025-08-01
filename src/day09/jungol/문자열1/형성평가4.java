package day09.jungol.문자열1;
import java.util.*;

public class 형성평가4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        char c = sc.next().charAt(0);

        int place = s.indexOf(c);
        if(place == -1) System.out.println("No");
        else System.out.println(place);
    }
}
