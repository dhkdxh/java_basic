package week2.day06.jungol_배열;
import java.util.*;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int index= 0;
        int num = -1;
        while(num != 0) {
            num = sc.nextInt();
            arr[index] = num;
            index++;
        }

        for(int i=1; i<index-1; i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
