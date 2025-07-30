package day07.jungol_배열2;
import java.util.*;

public class 연습문제2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];

        while(true){
            int input = sc.nextInt();

            if(input == 0) break;
            arr[input%10]++;
        }

        for(int i=0; i<10; i++){
            if(arr[i]>0) System.out.printf("%d : %d개\n", i, arr[i]);
        }
    }
}
