package week2.day09.jungol.문자열2;
import java.util.*;

public class 연습문제9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = new String[5];

        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
