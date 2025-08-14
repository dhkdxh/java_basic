package week2.day09.jungol.문자열2;
import java.util.*;

public class 연습문제2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        String[] arr = s.split(" ");

        for (String string : arr) {
            System.out.println(string);
        }
    }
}
