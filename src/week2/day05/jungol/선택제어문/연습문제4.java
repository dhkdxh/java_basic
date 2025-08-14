package week2.day05.jungol.선택제어문;
import java.util.*;

public class 연습문제4 {
    public static void main(String[] args) {
        try {
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
        }catch(InputMismatchException E){
            System.out.println("숫자만 입력이 가능합니다.");
        }
    }
}
