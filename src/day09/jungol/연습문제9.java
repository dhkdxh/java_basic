package day09.jungol;
import java.util.*;

public class 연습문제9 {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            System.out.println(s.substring(i+1)+s.substring(0,i+1));
        }
    }
}

