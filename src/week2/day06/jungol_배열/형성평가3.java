package week2.day06.jungol_배열;
import java.util.*;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0, sum2 = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                sum1 += arr[i];
            }else{
                sum2 += arr[i];
            }
        }
        System.out.println("odd : "+sum1);
        System.out.println("even : "+sum2);
    }
}
