package day05;
import java.util.*;

public class SwitchEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = ((int)Math.random()*6)+1;

        switch(randomNum) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            //break를 해주지 않으면 해당 수 부터 밑의 case까지 다 출력됨

            default:
                System.out.println("else"); //default는 break가 없음
        }


        //start부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드
        //int n=0,start=0;
        //int ran2 = ((int)Math.random()*n)+start;


        char grade = sc.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;
        }
    }
}
