package week1.day03.jungol;
import java.util.*;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        System.out.print("두 수를 입력하시오. ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);
        System.out.printf("%d * %d = %d", num1,num2,num1*num2);
    }
}
