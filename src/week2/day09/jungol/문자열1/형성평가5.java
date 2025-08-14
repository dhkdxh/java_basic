package week2.day09.jungol.문자열1;
import java.util.*;

public class 형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] list = s.split(" ");

        System.out.println(Math.max(list[0].length(), list[1].length()));
    }
}
