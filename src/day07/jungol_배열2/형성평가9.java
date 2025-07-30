package day07.jungol_배열2;
import java.util.*;

public class 형성평가9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(i-1<0 || j-1<0) arr[i][j]=1;
                else{
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
