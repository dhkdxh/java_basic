package week2.day05.jungol.반복제어문3;
import java.util.*;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(sum<=num){
            sum += i;
            i++;
        }
        System.out.println(i-1 + " "+sum);
    }
}
