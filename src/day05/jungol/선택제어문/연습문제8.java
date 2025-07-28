package day05.jungol.선택제어문;
import java.util.*;

public class 연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        int num = sc.nextInt();

        if(num>=90){
            System.out.println("A");
        }
        else if(num>=80){
            System.out.println("B");
        }
        else if(num>=70){
            System.out.println("C");
        }
        else if(num>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
