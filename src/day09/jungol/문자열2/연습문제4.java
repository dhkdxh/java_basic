package day09.jungol.문자열2;
import java.util.*;

public class 연습문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int index = (arr[0].length() == Math.min(arr[0].length(), arr[1].length()))?  0:1;

        System.out.println(arr[index]);
        System.out.println(arr[1-index]);
    }

}
