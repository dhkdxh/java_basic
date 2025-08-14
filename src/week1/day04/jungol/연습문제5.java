package week1.day04.jungol;
import java.util.*;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean b1 = (a==b);
        boolean b2 = (b==c);

        if(b1) System.out.print(1+" ");
        else System.out.print(0+" ");

        if(b2) System.out.print(1+" ");
        else System.out.print(0+" ");

        b1 = !b1;
        b2 = !b2;

        if(b1) System.out.print(1+" ");
        else System.out.print(0+" ");

        if(b2) System.out.print(1+" ");
        else System.out.print(0+" ");
    }
}
