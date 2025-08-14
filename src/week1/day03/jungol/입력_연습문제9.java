package week1.day03.jungol;
import java.util.*;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 실수를 입력하시오.");

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.printf("x = %.2f\ny = %.2f", d1,d2);
    }
}
