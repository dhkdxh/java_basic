package jungol;

public class 출력_연습문제4 {
    public static void main(String[] args) {
//        System.out.println("   @@ ");
//        System.out.println("  @  @");
//        System.out.println(" @    @");
//        System.out.println("@      @");
//        System.out.println(" @    @");
//        System.out.println("  @  @");
//        System.out.println("   @@");

        for(int j=0; j<4; j++){
            for(int i=3-j; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("@");
            for(int i=0; i<j*2; i++){
                System.out.print(" ");
            }
            System.out.print("@\n");
        }

        for(int j=2; j>=0; j--){
            for(int i=3-j; i>0; i--){
                System.out.print(" ");
            }
            System.out.print("@");
            for(int i=0; i<j*2; i++){
                System.out.print(" ");
            }
            System.out.print("@\n");
        }
    }
}
