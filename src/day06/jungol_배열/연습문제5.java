package day06.jungol_배열;

import java.util.*;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[13];

        for(int i=1; i<=12; i++){
            if(i==2) arr[i]=28;
            else if(i==4 ||i==6|| i==9 ||i==11) arr[i] = 30;
            else arr[i]=31;
        }

        int year=1, month = 1;

        while(true){
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            if(month==0) break;
            if(month<0 || month>12) {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
                continue;
            }

            int num = 0;
            if(year%400==0 ||(year%4==0 && year%100!=0)){
                if(month==2) num = arr[month]+1;
                else num = arr[month];
            }
            else num = arr[month];

            System.out.printf("입력하신 달의 날 수는 %d일입니다\n", num);
            System.out.println();
        }
    }
}
