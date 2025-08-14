package week2.day05.jungol.반복제어문2;
import java.util.*;

public class 연습문제2_5 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<10; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }

        System.out.printf("입력받은 짝수는 %d개입니다.", count);
    }
}
