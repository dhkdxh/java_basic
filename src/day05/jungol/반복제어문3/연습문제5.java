package day05.jungol.반복제어문3;

public class 연습문제5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int j = 5-i;
            while(j>0) {
                System.out.print(" ");
                j--;
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
