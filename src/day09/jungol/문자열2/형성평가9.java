package day09.jungol.문자열2;
import java.util.*;
public class 형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");

        double num = Double.parseDouble(arr[1]);
        num = Math.round(num*1000.0)/1000.0;

        arr[1] = String.valueOf(num);

        String str = arr[0]+arr[1]+arr[2];

        System.out.println(str.substring(0,(str.length()+1)/2));
        System.out.println(str.substring((str.length()+1)/2));
    }
}
