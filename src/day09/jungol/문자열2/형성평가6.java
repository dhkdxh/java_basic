package day09.jungol.문자열2;
import java.util.*;
public class 형성평가6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int num = Integer.parseInt(arr[2]);

        String s1 = arr[0]+arr[1];
        String s2 = arr[1].replace(arr[1].substring(0,num), s1.substring(0,num));

        System.out.println(s1);
        System.out.println(s2);
    }
}
