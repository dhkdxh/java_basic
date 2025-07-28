package day05.jungol.반복제어문1;

public class 연습문제2 {
    public static void main(String[] args) {
        int num = 1;
        int sum=0;

        while(num<=10){
            sum += num;
            num++;
        }

        System.out.println("1부터 10까지의 합 = "+ sum);
        System.out.println("while문이 끝난 후의 num의 값 = "+num);
    }
}
