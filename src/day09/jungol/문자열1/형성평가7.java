package day09.jungol.문자열1;
import java.util.*;

public class 형성평가7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d. %s\n", i+1, arr[i]);
        }
    }
}
