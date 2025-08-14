package week2.day05.jungol.선택제어문;
import java.util.*;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 수를 입력하세요. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maxNum = Math.max(num1,Math.max(num2,num3));

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", maxNum);
    }
}
