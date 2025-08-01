package day09;

import java.util.Arrays;

public class Ex05 {

    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 50};
        int[] newArray = new int[oldArray.length * 10];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }//too late

        //System.arraycopy() 이용
        int[] systemArray1 = new int[oldArray.length*2];

        System.arraycopy(oldArray,0,systemArray1,0,oldArray.length);

        for (int i : systemArray1) {
            System.out.println(i);
        }

        //Arrays.copyOf() 이용
        int[] copyOf1 = new int[oldArray.length * 2];

        copyOf1 = Arrays.copyOf(oldArray, copyOf1.length);

        System.out.println(Arrays.toString(copyOf1));
    }
}
