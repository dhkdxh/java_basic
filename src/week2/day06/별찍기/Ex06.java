package week2.day06.별찍기;

public class Ex06 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print("_");
            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
