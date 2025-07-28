package day05.jungol.선택제어문;
import java.util.*;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean b = (num1>num2);

        if(b) {
            System.out.println(num1-num2);
        }else{
            System.out.println(num2-num1);
        }
    }
}
