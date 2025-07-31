package JavaBasic.JavaBasic_02.test.loop_array;
import java.util.*;

public class JavaBasic8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int currentMoney = 0;

        Outter:
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            try {
                String input = sc.nextLine();
                int number = Integer.parseInt(input);

                int money = 0;
                switch (number) {
                    case 1:
                        System.out.print("예금액>");
                        money = Integer.parseInt(sc.nextLine());
                        currentMoney += money;
                        break;
                    case 2:
                        System.out.print("출금액>");
                        money = Integer.parseInt(sc.nextLine());

                        if (money > currentMoney) {
                            System.out.println("현재 있는 금액보다 더 많은 금액을 출금하실 수 없습니다.");
                        } else {
                            currentMoney -= money;
                        }
                        break;
                    case 3:
                        System.out.print("잔고>");
                        System.out.print(currentMoney + "\n");
                        break;
                    case 4:
                        break Outter;
                    default:
                        System.out.println("숫자를 잘못 입력하셨습니다. 1-4까지의 숫자를 입력해주세요.");
                }
                System.out.println();
                System.out.println();
            }catch(Exception e) {
                System.out.println("예외가 발생하였습니다.");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
