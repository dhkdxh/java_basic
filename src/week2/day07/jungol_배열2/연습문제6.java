package week2.day07.jungol_배열2;
import java.util.*;

public class 연습문제6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] sum1 = new int[3];
        int total = 0;
        for(int i=1; i<=3; i++){
            System.out.printf("%d번째 학생의 점수 ", i);
            for(int j=1; j<=3; j++){
                arr[i-1][j-1] = sc.nextInt();
                sum1[i-1] += arr[i-1][j-1];
            }
        }

        int[] sum2 = new int[3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum2[i] += arr[j][i];
            }
        }

        System.out.printf("%7s %s %s %s\n", "국어", "영어", "수학", "총점");
        for(int i=0; i<3; i++){
            System.out.printf(" %d번", i+1);
            for(int j=0; j<3; j++){
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.printf("%4d\n", sum1[i]);
            total += sum1[i];
        }
        System.out.printf("합계%4d%4d%4d%4d",sum2[0], sum2[1], sum2[2], total);
    }
}
