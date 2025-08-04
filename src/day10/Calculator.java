package day10;
import java.util.*;

public class Calculator{
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static void main(String[] args) {
        while(a){
            start();
        }
    }

    public static int[] userInput() {
        String[] input = sc.nextLine().split(" ");

        int[] userinput = new int[3];
        for (int i = 0; i < userinput.length; i++) {
            userinput[i] = Integer.parseInt(input[i]);
        }
        return userinput;
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(int num1, int num2, int menuNum) {
        int result = 0;
        int flag=0;
        switch (menuNum) {
            case 1: result = num1 + num2; break;
            case 2: result = num1 - num2; break;
            case 3: result = num1 * num2; break;
            case 4:
                if(num2==0) {div0(); flag=1;}
                else result = num1 / num2;
                break;
            case 5: a = false; break;
            default:
                System.out.println("숫자만 입력해주세요.");
        }
        menu2(num1,num2,menuNum,result, flag);
    }

    public static void menu2(int num1, int num2, int menuNum,int result, int flag) {
        switch (menuNum) {
            case 1: System.out.printf("%d + %d = %d \n",num1, num2,result); break;
            case 2: System.out.printf("%d - %d = %d \n",num1, num2,result); break;
            case 3: System.out.printf("%d * %d = %d \n",num1, num2,result); break;
            case 4:
                if(flag==0) System.out.printf("%d / %d = %.1f \n",num1, num2,(double)result);
                break;
            case 5: a = false; break;
        }
    }

    public static void start() {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        int[] arr = userInput();

        calculator(arr[0],arr[1],arr[2]);
    }

    public static void div0(){
        System.out.println("0으로 나누는 것은 불가능합니다.");
    }
}
