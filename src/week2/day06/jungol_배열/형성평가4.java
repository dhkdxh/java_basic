package week2.day06.jungol_배열;
import java.util.*;

public class 형성평가4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[100];
        int index = 0;

        while(true){
            int input = sc.nextInt();
            if(input==-1) break;
            arr[index] = input;
            index++;
        }

        //실제 저장된 arr의 length = 0 -> index-1
        for(int i=0; i<3; i++){
            int current = index-3+i;
            if(current<0) continue;
            System.out.print(arr[current]+" ");
        }
    }
}
