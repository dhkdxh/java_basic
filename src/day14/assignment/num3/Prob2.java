package day14.assignment.num3;
import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        String inputStr;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. : ");
        inputStr = keyboard.nextLine();

        //프로그램을 구현하세요.
        for(int i=inputStr.length()-1; i>=0; i--){
            char c = inputStr.charAt(i);
            c = Character.toUpperCase(c);
            System.out.print(c);
        }
    }
}
