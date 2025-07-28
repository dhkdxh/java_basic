package day05.jungol.반복제어문3;
import java.util.*;

public class 형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        char c = 'A';
        int n = 0;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(c+" ");
                c++;
            }
            for(int j=1; j<i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
