package week2.day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            for(int j=1; j<=9; j++){
                for(int i=num1; i>=num2; i--){
                    System.out.printf("%d * %d =%3d   ",i,j,i*j);
                }
                System.out.println();
            }
        }else{
            for(int j=1; j<=9; j++){
                for(int i=num1; i<=num2; i++){
                    System.out.printf("%d * %d =%3d   ",i,j,i*j);
                }
                System.out.println();
            }
        }
    }
}
