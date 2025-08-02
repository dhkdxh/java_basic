package day09.jungol.문자열2;
import java.util.*;

public class 형성평가7 {
    static Scanner sc = new Scanner(System.in);

    public static int extractInteger(String str){
        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }else break;
        }
        if(sb.length() == 0) return 0;
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        String[] arr = sc.nextLine().split("  ");

        int num1 = extractInteger(arr[0]);
        int num2 = extractInteger(arr[1]);

        System.out.println(num1*num2);
    }
}
