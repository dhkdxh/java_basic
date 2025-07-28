package day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.printf("%.2f\n", (double)sum/n);
    }
}
