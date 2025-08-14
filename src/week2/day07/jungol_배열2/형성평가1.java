package week2.day07.jungol_배열2;
import java.util.*;

public class 형성평가1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[7];

        for(int i=0; i<10; i++){
            int input = sc.nextInt();

            arr[input]++;
        }

        for(int i=1; i<=6; i++){
            System.out.printf("%d : %d\n", i+1, arr[i]);
        }
    }
}
