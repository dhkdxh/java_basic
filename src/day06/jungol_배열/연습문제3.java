package day06.jungol_배열;
import java.util.*;

public class 연습문제3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(arr[2]+" "+arr[4]+" "+arr[9]);
    }
}
