package day05.jungol.반복제어문3;
import java.util.*;

public class 얀습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
