package day05.jungol.반복제어문2;
import java.util.*;

public class 자가진단2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        for(int i=num; i<=100; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
