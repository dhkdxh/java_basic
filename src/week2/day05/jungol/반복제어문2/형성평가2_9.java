package week2.day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print("("+i+", "+j+") ");
            }
            System.out.println();
        }
    }
}
