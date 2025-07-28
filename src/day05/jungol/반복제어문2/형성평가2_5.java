package day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            if(num%2==0) even++;
            else odd++;
        }
        System.out.printf("even : %d\nodd : %d", even,odd);
    }
}
