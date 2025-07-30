package day06.jungol_배열;
import java.util.*;

public class 형성평가5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] arr = new double[6];

        double sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        System.out.printf("%.1f", sum/arr.length);
    }
}
