package week2.day06.jungol_배열;

import java.util.*;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] odd = new int[10];
        int[] even = new int[10];

        int oddidx = 0, evenidx = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even[evenidx] = num;
                evenidx++;
            } else {
                odd[oddidx] = num;
                oddidx++;
            }
        }

        int oddmin = odd[0];
        int evenmax = even[0];
        boolean flag1 = false, flag2 = false;

        for(int i=0; i<oddidx; i++){
            if(oddmin >= odd[i]) oddmin = odd[i];
            flag1 = true;
        }

        for(int i=0; i<evenidx; i++){
            if(evenmax <= even[i]) evenmax = even[i];
            flag2 = true;
        }

        if(flag1) System.out.print(oddmin+" ");
        if(flag2) System.out.print(evenmax);
    }
}
