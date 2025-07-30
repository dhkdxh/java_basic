package day06.jungol_배열;
import java.util.*;

public class 형성평가8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[100];
        int index=0, sum = 0, count=0;

        while(true){
            int input = sc.nextInt();
            if(input == 0) break;

            arr[index] = input;
            if(arr[index]%5==0) {
                count++;
                sum += arr[index];
            }
            index++;
        }

        System.out.println("Multiples of 5 : "+count);
        System.out.println("sum : "+ sum);
        System.out.printf("avg : %.1f", (double)sum/count);
    }
}
