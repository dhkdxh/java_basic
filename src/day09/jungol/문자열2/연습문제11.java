package day09.jungol.문자열2;
import java.util.*;

public class 연습문제11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");

        String str = "";

        for (String s : arr) {
            double d = Double.parseDouble(s);
            d = Math.round(d*100.0)/100.0;
            str += String.valueOf(d);
        }

        String[] arr1 = str.split("\\.");
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
