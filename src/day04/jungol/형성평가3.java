package day04.jungol;
import java.util.*;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 += 5;
        num2 *= 2;

        System.out.printf("width = %d\nlength = %d\narea = %d", num1,num2,num1*num2);
    }
}
