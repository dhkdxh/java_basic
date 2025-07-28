package day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = num;
        while(true){
            if(i<=num*10){
                System.out.print(i + " ");
                i += 5;
            }
        }
    }
}
