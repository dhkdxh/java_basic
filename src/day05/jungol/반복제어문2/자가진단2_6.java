package day05.jungol.반복제어문2;
import java.util.*;

public class 자가진단2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++){
            int score = sc.nextInt();
            sum += score;
        }

        double avg = (double)sum/num;
        System.out.printf("avg : %.1f\n", avg);
        if(avg >= 80) System.out.println("pass");
        else System.out.println("fail");
    }
}
