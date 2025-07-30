package day07.jungol_배열2;
import java.util.*;

public class 형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[11];

        while(true){
            int input = sc.nextInt();
            if(input==0) break;

            arr[input/10]++;
        }

        for(int i=10; i>=0; i--){
            if(arr[i]>0) System.out.printf("%d : %d person\n", i*10, arr[i]);
        }
    }
}
