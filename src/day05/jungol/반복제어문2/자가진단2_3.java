package day05.jungol.반복제어문2;
import java.util.*;

public class 자가진단2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=2; i<=num; i+=2){
            System.out.print(i + " ");
        }
    }
}
