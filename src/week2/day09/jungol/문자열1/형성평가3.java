package week2.day09.jungol.문자열1;
import java.util.*;

public class 형성평가3 {
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        int index=0;
        while(index<s.length()){
            char c = s.charAt(index);
            if(c>=65 && c<=90 || c>=97 && c<=122) System.out.print(Character.toLowerCase(c));
            else if(Character.isDigit(c)) System.out.print(c);
            index++;
        }
    }
}
