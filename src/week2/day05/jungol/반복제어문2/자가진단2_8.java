package week2.day05.jungol.반복제어문2;

public class 자가진단2_8 {
    public static void main(String[] args) {
        int i=2;
        while(i<=4){
            int j = 1;
            while(j<=5){
                System.out.printf("%d * %d =  %-3d",i,j,i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
