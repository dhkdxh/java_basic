package week1.day04;
import java.util.*;

public class Quiz1 {
    public static void main(String[] args) {
        System.out.printf("상품의 가격: %d원\n", 5000);
        System.out.printf("상품의 가격:%7d원\n", 5000);
        System.out.printf("상품의 가격: %06d원\n", 5000);

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("반지름을 입력하세요. ");
        int num = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f\n", num, num*num*3.14);
    }
}
