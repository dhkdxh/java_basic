package week1.day04;

public class BlockScope1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(i=1; i<=5; i++) {
            sum += i;
            System.out.println(i+" "+sum);
        }//1-5까지의 합 나열

        int sum2 = 0;
        for(int j=1; j<=100; j++){
            System.out.print(j + ": ");
            sum2 += j;
            System.out.print(sum2);
            System.out.println();
        }//1-100까지의 합 나열
    }
}
