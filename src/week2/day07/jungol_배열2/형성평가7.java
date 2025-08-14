package week2.day07.jungol_배열2;
import java.util.*;

public class 형성평가7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        int[][] total = new int[2][3];

        System.out.println("first array");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                total[i][j] = arr1[i][j]*arr2[i][j];
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }
    }
}
