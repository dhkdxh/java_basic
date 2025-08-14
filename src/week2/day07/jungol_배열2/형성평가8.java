package week2.day07.jungol_배열2;
import java.util.*;

public class 형성평가8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int[] colavg = new int[2];
        int[] rowavg = new int[4];
        int total = 0;

        for(int i=0; i<4; i++){
            int sum = 0;
            for(int j=0; j<2; j++){
                arr[i][j]= sc.nextInt();
                sum+=arr[i][j];
            }
            total += sum;
            rowavg[i] = sum/2;
        }

        for(int i=0; i<4; i++){
            System.out.print(rowavg[i]+" ");
        }
        System.out.println();

        for(int i=0; i<2; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum += arr[j][i];
            }
            colavg[i] = sum/4;
            System.out.print(colavg[i]+" ");
        }
        System.out.println();
        System.out.println(total/8);
    }
}
