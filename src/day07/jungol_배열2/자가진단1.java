package day07.jungol_배열2;
import java.util.*;

public class 자가진단1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[26];

        String s = sc.nextLine();

        for(int i = 0; i<s.length(); i+=2){
            char c = s.charAt(i);

            if(c<65 || c>90) break;
            arr[(int)c - 65] ++;
        }

        for(int i=0; i<26; i++){
            if(arr[i]>0){
                System.out.printf("%c : %d\n", i+65, arr[i]);
            }
        }
    }
}
