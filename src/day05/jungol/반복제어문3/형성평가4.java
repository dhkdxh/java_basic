package day05.jungol.반복제어문3;
import java.util.*;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(num-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<num; i++){
            for(int j=1; j<=num-i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
