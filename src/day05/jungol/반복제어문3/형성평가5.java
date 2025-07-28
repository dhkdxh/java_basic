package day05.jungol.반복제어문3;
import java.util.*;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //2*num-1-(i*2-1) = 2(num-i)
        for(int i=1; i<=num; i++){
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
