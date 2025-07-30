package day07.jungol_배열2;

public class 연습문제3 {
    public static void main(String[] args) {
        int[] arr = new int[41];

        arr[1] = 1;
        arr[2] = 1;

        for(int i=3; i<=40; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        System.out.println("피보나치 수열 10항 : "+arr[10]);
        System.out.println("피보나치 수열 20항 : "+arr[20]);
        System.out.println("피보나치 수열 30항 : "+arr[30]);
        System.out.println("피보나치 수열 40항 : "+arr[40]);
    }
}
