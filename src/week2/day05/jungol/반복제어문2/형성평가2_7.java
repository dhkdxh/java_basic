package week2.day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 1;
        while(i*num <= num * 10) {
            System.out.print(i*num + " ");
            i += 1;
        }

        System.out.println();

        for(int j=1; j<=10; j++){
            System.out.print(j*num+" ");
        }
    }
}
