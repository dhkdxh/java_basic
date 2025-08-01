package day09.jungol.문자열2;
import java.util.*;

public class 연습문제8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");

        String bigger = (arr[0].compareTo(arr[1])<0)? arr[1]:arr[0];
        System.out.println(bigger + " 가(이) 더 큽니다.");

        boolean check = (arr[0].substring(0,3).equals(arr[1].substring(0,3)));

        if(check) System.out.println("앞의 세 문자가 같습니다.");
        else System.out.println("앞의 세 문자가 같지 않습니다.");
    }
}
