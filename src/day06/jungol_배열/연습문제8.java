package day06.jungol_배열;
import java.util.*;

public class 연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("총점 = "+sum);
        double avg = (double) sum/arr.length;
        System.out.printf("평균 = %.1f", avg);
    }
}
