package week2.day05.jungol.반복제어문2;

public class 연습문제2_8 {
    public static void main(String[] args) {
        int i=1;
        while(i<=9){
            int j=2;
            while(j<=4){
                System.out.printf("%d * %d = %-4d", j, i, j*i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
