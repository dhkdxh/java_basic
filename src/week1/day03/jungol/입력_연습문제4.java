package week1.day03.jungol;

public class 입력_연습문제4 {
    public static void main(String[] args) {
        int length = 5;
        double var1 = length*2*3.14;
        double var2 = length*length*3.14;

        System.out.printf("%d * %d * %.6f = %.6f\n", length, 2, 3.14,var1);
        System.out.printf("%d * %d * %.6f = %.6f", length, length, 3.14, var2);
    }
}
