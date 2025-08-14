package week2.day09.jungol.문자열2;
import java.util.*;

public class 연습문제1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
