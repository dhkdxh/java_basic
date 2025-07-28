package day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean check = true;

        if(num1 >= num2) check=false;

        if(check){
            for(int i=num1; i<=num2; i++){
                System.out.print(i + " ");
            }
        }
        else{
            for(int i=num2; i<=num1; i++){
                System.out.print(i + " ");
            }
        }
    }
}
