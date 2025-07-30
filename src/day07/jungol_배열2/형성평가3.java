package day07.jungol_배열2;
import java.util.*;

public class 형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr= new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for(int i=2; i<10; i++){
            arr[i] = (arr[i-1]+arr[i-2])%10;
        }

        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
