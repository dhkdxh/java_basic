package day05.jungol.선택제어문;
import java.util.*;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num==2){
            System.out.println(28);
        }else if(num==4 || num==6||num==9||num==11){
            System.out.println(30);
        }else {
            System.out.println(31);
        }
    }
}
