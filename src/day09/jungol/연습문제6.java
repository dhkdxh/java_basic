package day09.jungol;
import java.util.*;

public class 연습문제6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            char c = sc.nextLine().charAt(0);

            if(c>=65 && c<=90) System.out.println("대문자입니다.");
            else if(c>=97 && c<=122) System.out.println("소문자입니다.");
            else if(Character.isDigit(c)) System.out.println("숫자문자입니다.");
            else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
