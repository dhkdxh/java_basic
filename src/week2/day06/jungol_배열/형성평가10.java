package week2.day06.jungol_배열;
import java.util.*;

public class 형성평가10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
