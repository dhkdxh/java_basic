package week2.day06.jungol_배열;
import java.util.*;

public class 형성평가7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[100];
        int index = 0;

        while(true){
            int input = sc.nextInt();
            if(input==999) break;

            arr[index] = input;
            index++;
        }

        int minNum = arr[0];
        int maxNum = arr[0];

        for(int i=0; i<index; i++){
            if(arr[i]<=minNum) minNum = arr[i];

            if(arr[i]>=maxNum) maxNum = arr[i];
        }

        System.out.println("max : "+maxNum);
        System.out.println("min : "+minNum);
    }
}
