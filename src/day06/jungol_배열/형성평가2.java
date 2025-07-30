package day06.jungol_배열;
import java.util.*;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<arr.length; i += 2){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
