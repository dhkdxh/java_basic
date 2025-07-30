package day06.jungol_배열;
import java.util.*;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];

        String s = sc.nextLine();

        int arrIdx = 0;
        for(int i=0; i<s.length(); i++){
            if(i%2==0) {
                arr[arrIdx] = s.charAt(i);
                arrIdx++;
            }
        }

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
