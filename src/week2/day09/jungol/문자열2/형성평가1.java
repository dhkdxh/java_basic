package week2.day09.jungol.문자열2;
import java.util.*;

public class 형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");

        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
