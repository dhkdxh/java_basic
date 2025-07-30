package day06.jungol;
import java.util.*;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int maxnum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(i==0) maxnum = arr[0];
            else {
                if(maxnum <= arr[i]){
                    maxnum = arr[i];
                }
            }
        }

        System.out.println(maxnum);
    }
}
