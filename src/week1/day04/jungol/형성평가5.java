package week1.day04.jungol;
import java.util.*;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h2 = sc.nextInt();
        int w2 = sc.nextInt();

        if(h1>h2 && w1>w2) System.out.print(1);
        else System.out.print(0);
    }
}
