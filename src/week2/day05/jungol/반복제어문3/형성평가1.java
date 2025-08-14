package week2.day05.jungol.반복제어문3;
import java.util.*;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int input = sc.nextInt();

        int sum = 0;
        while(count<=20 && input!=0){
            sum += input;
            count++;
            input = sc.nextInt();
        }

        System.out.print(sum + " "+ sum/count);
    }
}
