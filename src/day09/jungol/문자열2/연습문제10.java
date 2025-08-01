package day09.jungol.문자열2;
import java.util.*;

public class 연습문제10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        int sum = 0;
        for(int i=0; i<2; i++){
            int num = Integer.parseInt(arr1[i]);
            System.out.print(num+" ");
            if(i==0) System.out.print("+ ");
            else System.out.print("= ");
            sum += num;
        }
        System.out.print(sum+"\n");

        double sum1 = 0;
        for(int j=0; j<2; j++){
            double num = Double.parseDouble(arr2[j]);
            System.out.printf("%.2f ", num);
            if(j==0) System.out.print("+ ");
            else System.out.print("= ");
            sum1 += num;
        }
        System.out.printf("%.2f\n", sum1);
    }
}
