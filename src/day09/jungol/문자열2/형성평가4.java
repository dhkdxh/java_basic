package day09.jungol.문자열2;
import java.util.*;
public class 형성평가4 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int input = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[input];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
