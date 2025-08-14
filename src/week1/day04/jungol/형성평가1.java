package week1.day04.jungol;
import java.util.*;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int sum = num1 + num2 + num3 + num4;
        System.out.printf("sum %d\navg %d", sum, (sum/4));
    }
}
