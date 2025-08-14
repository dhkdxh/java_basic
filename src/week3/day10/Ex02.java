package week3.day10;
import java.util.*;

public class Ex02 {
    static Scanner sc = new Scanner(System.in);

    public static void menuRrint(){
        System.out.println("============================================");
        System.out.println("                사칙연산 계산기         ");
        System.out.println("============================================");
        System.out.println("1.덧셈  2.뺄셈  3.곱셈  4. 나눗셈  5.프로그램 종료");
        System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요.");
    }

    public static void main(String[] args) {
        Outter:
        while(true){
            menuRrint();

            String[] input = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            int flag = Integer.parseInt(input[2]);

            switch(flag){
                case 1:
                    adder(num1,num2);
                    break;
                case 2:
                    minus(num1,num2);
                    break;
                case 3:
                    mulit(num1,num2);
                    break;
                case 4:
                    div(num1,num2);
                    break;
                case 5:
                    break Outter;
                default:
                    System.out.println("숫자를 잘못입력하였습니다. 1-5까지의 숫자를 입력해주세요.");
            }
        }
    }

    public static void adder(int num1, int num2){
        System.out.println("결과는");
        System.out.println();
        System.out.println(num1+ " + "+num2+" = "+(num1+num2));
    }

    public static void minus(int num1, int num2){
        System.out.println("결과는");
        System.out.println();
        System.out.println(num1+ " - "+num2+" = "+(num1-num2));
    }

    public static void mulit(int num1, int num2){
        System.out.println("결과는");
        System.out.println();
        System.out.println(num1+ " * "+num2+" = "+(num1*num2));
    }

    public static void div(int num1, int num2){
        if(num2==0) {
            System.out.println("0으로 나누는 것은 불가합니다");
            return;
        }
        System.out.println("결과는");
        System.out.println();
        System.out.println(num1+ " / "+num2+" = "+(num1/num2));
    }
}
