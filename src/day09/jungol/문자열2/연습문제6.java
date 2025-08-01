package day09.jungol.문자열2;
import java.util.*;

public class 연습문제6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] arr= s.split(" ");

        String sub = arr[0].substring(0,3);
        System.out.println(arr[0].replace(arr[0].substring(0,3), arr[1].substring(0,3)));
        System.out.println(arr[1] += sub);
    }
}
