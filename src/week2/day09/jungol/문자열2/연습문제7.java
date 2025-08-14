package week2.day09.jungol.문자열2;
import java.util.*;

public class 연습문제7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr= {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        System.out.print("문자를 입력하세요. ");
        char c = sc.nextLine().charAt(0);

        int count = 0;
        for (String s : arr) {
            if(s.indexOf(c) != -1) System.out.println(s);
            count++;
        }
        if(count==0) System.out.println("찾는 단어가 없습니다.");
        System.out.println();

        System.out.print("문자열을 입력하세요. ");
        String str = sc.nextLine();

        count = 0;
        for (String s : arr) {
            if(s.contains(str)) System.out.println(s);
            count++;
        }
        if(count==0) System.out.println("찾는 단어가 없습니다.");
    }
}
