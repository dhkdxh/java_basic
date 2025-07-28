package day05.jungol.반복제어문3;
import java.util.*;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int current = 1;
        while(current*num<=100 && current*num <= num*10) {
            System.out.print(current*num + " ");
            current++;
        }
    }
}
