package day05.jungol.반복제어문2;
import java.util.*;

public class 형성평가2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int count=0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int bigNum,smallNum;

        if(num1>=num2){
            bigNum=num1;
            smallNum=num2;
        }
        else {
            bigNum=num2;
            smallNum=num1;
        }

        for(int i=smallNum; i<=bigNum; i++){
            if(i%3==0 ||i%5==0) {
                sum+=i;
                count++;
            }
        }

        System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f",(double)sum/count);
    }
}
