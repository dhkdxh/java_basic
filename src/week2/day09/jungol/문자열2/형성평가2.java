package week2.day09.jungol.문자열2;
import java.util.*;

public class 형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = {"flower", "rose", "lily", "daffodil", "azalea"};

        char input = sc.nextLine().charAt(0);

        int count = 0;
        for (String s : arr) {
            boolean flag = (s.charAt(1)==input || s.charAt(2)==input);
            if(flag) {
                System.out.println(s);
                count++;
            }
        }

        System.out.println(count);
    }
}
