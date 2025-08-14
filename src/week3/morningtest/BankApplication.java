package week3.morningtest;
import java.util.*;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int index = 0;
    static boolean flag = true;

    public static void main(String[] args) {
        for(int i=0; i< accounts.length; i++){
            accounts[i] = new Account();
        }

        while(flag){
            printScreen();
        }
    }

    public static void printScreen() {
        System.out.println("---------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("---------------------------------------------");
        System.out.print("선택> ");
        int num = Integer.parseInt(sc.nextLine());

        choice(num);
    }

    public static void choice(int num){
        switch(num){
            case 1:
                createAccount();
                break;
            case 2:
                printAccount();
                break;
            case 3:
                addMoney();
                break;
            case 4:
                minusMoney();
                break;
            case 5:
                System.out.println("프로그램 종료");
                flag = false;
                break;
            default:
                System.out.println("1-5까지의 정수를 입력해주세요.");
        }
    }

    public static void createAccount(){
        System.out.println("---------");
        System.out.println("계좌생성");
        System.out.println("---------");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("계좌주: ");
        String name = sc.nextLine();
        System.out.print("초기입금액: ");
        int money = Integer.parseInt(sc.nextLine());

        if(money<0){
            System.out.println("초기입금액은 음수일 수 없습니다.");
            System.out.println("결과: 계좌가 생성되지 않았습니다.");
            return;
        }

        accounts[index].setName(name);
        accounts[index].setAccountNum(accountNum);
        accounts[index].setBalance(money);
        index++;
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public static void printAccount(){
        System.out.println("---------");
        System.out.println("계좌목록");
        System.out.println("---------");
        for (int i=0; i<index; i++) {
            System.out.println(accounts[i].getAccountNum()+"\t"+accounts[i].getName()+"\t"+accounts[i].getBalance());
        }
    }

    public static void addMoney(){
        System.out.println("---------");
        System.out.println("예금");
        System.out.println("---------");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("예금액: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i=0; i<index; i++) {
            if(accounts[i].getAccountNum().equals(accountNum)){
                accounts[i].setBalance(num);
                return;
            }
        }
        System.out.println("해당 계좌번호를 찾을 수 없습니다. 계좌 등록을 먼저해주세요.");
    }

    public static void minusMoney(){
        System.out.println("---------");
        System.out.println("출금");
        System.out.println("---------");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("출금액: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i=0; i<index; i++) {
            if(accounts[i].getAccountNum().equals(accountNum)){
                if(accounts[i].getBalance()-num<0){
                    System.out.println("결과: 출금에 실패하였습니다.");
                    return;
                }
                accounts[i].setBalance(accounts[i].getBalance()-num);
                System.out.println("결과: 출금에 성공되었습니다.");
                return;
            }
        }
        System.out.println("해당 계좌번호를 찾을 수 없습니다.");
    }
}
