package day05.jungol;
import java.util.*;

public class 연습문제2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i =0; i<5; i++){
            int num = sc.nextInt();
            sum += num;
        }

        System.out.printf("총점: %d\n", sum);
        System.out.printf("평균: %.1f\n", (double)sum/5);
    }
}
