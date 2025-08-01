package day09.jungol;
import java.util.*;

public class 연습문제8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();

        String[] answer = s.split(" ");
        for (String string : answer) {
            System.out.println(string);
        }
    }
}
