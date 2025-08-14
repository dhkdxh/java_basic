package week2.day06.jungol_배열;
import java.util.*;

public class 형성평가9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[100];
        int index = 0;

        while(true){
            int input = sc.nextInt();
            if(input == 0) break;

            arr[index] = input;
            if(input%2==0){
                arr[index] /= 2;
            }else{
                arr[index] *= 2;
            }
            index++;
        }

        System.out.println(index-1);
        for(int i=0; i<index; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
