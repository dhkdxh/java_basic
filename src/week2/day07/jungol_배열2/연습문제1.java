package week2.day07.jungol_배열2;
import java.util.*;

public class 연습문제1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[11];

        while(true){
            int input = sc.nextInt();
            if(input<1 || input>10) break;

            arr[input]++;
        }

        for(int i=1; i<=10; i++){
            if(arr[i]>0){
                System.out.printf("%d : %d개\n", i, arr[i]);
            }
        }
    }
}
