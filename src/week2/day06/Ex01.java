package week2.day06;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        //while을 이용하여 1-100까지의 합을 출력하는 프로그램
        int i=1;
        int sum=0;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println(sum);

        //키보드에서 "1"을 입력하면 속도 증가, "2"를 입력하면 속도 감소, "3"을 입력하면 종료
        Scanner sc = new Scanner(System.in);

        int vel = 0;
        while(true){
            String str = sc.nextLine();

            if(str.equals("3")) break;
            else if(str.equals("1")) vel++;
            else if(str.equals("2")) vel--;
        }
    }
}
