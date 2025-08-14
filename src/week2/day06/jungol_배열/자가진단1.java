package week2.day06.jungol_배열;
import java.util.*;

public class 자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = new char[10];
        int charidx = 0;

        for(int i=0; i<s.length(); i+=2){
            arr[charidx] = s.charAt(i);
            System.out.print(arr[charidx]);
            charidx++;
        }

    }
}
