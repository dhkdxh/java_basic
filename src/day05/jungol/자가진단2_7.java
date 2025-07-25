package day05.jungol;

public class 자가진단2_7 {
    public static void main(String[] args) {
        int i = 2;
        while(i<=6){
            int j=i;
            while(j<=i+4){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
