package day07.jungol_배열2;
import java.util.*;

public class 형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        for(int i=0; i<4; i++){
            System.out.printf("%dclass? ",i+1);
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<4; i++){
            int sum = 0;
            System.out.printf("%dclass : ", i+1);
            for(int j=0; j<3; j++){
                sum += arr[i][j];
            }
            System.out.print(sum+"\n");
        }
    }
}
