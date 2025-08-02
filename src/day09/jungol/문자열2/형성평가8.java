package day09.jungol.문자열2;
import java.util.*;
public class 형성평가8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            String input = sc.nextLine();

            if(input.equals("END")) break;

            char[] c = input.toCharArray();
            for(int i=input.length()-1; i>=0; i--){
                System.out.print(c[i]);
            }
            System.out.println();
        }
    }
}
