package day05.jungol.반복제어문3;

public class 연습문제6 {
    public static void main(String[] args) {

        int num1 = 1;
        char c = 97;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(c + " ");
                c++;
            }
            for(int j=1; j<=5-i; j++){
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();
        }
    }
}
