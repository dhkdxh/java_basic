package week2.day05.jungol.선택제어문;
import java.util.*;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1. 삽입\n2. 수정\n3. 삭제\n숫자를 선택하세요. ");
        int num = sc.nextInt();

        if(num==1){
            System.out.print("삽입을 ");
        }else if(num==2){
            System.out.print("수정을 ");
        }else{
            System.out.print("삭제를 ");
        }
        System.out.print("선택하셨습니다.\n");
    }
}
