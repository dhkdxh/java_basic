package day06.별찍기;

public class Ex05 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("_");
            }

            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
