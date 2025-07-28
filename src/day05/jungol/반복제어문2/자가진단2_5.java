package day05.jungol.반복제어문2;
import java.util.*;

public class 자가진단2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        int sum3 = 0;
        int sum5 = 0;
        for(int i=0; i<10; i++){
            if(arr[i]%3==0) sum3++;
            if(arr[i]%5==0) sum5++;
        }

        System.out.printf("Multiples of 3: %d\n", sum3);
        System.out.printf("Multiples of 5: %d\n", sum5);
    }
}
