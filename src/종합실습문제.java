import java.util.*;

public class 종합실습문제 {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static String phone;

    public static void main(String[] args) {

        System.out.print("당신의 이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("당신의 연락처를 입력하세요 : ");
        phone = sc.nextLine();

        int input = 0;
        while(input != 8){
            menuIntroduction();

            input = sc.nextInt();

            switch(input){
                case 1:
                    menuGuestInfo();
                    break;
                case 2:
                    menuCartItemList();
                    break;
                case 3:
                    menuCartClear();
                    break;
                case 4:
                    menuCartAddItem();
                    break;
                case 5:
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    menuCartRemoveItem();
                    break;
                case 7:
                    menuCartBill();
                    break;
                case 8:
                    menuExit();
                    break;
                default:
                    System.out.println("Wrong number. Please enter the number(1-8).");
            }
        }
    }

    public static void menuGuestInfo() {
        System.out.println("현재 고객 정보 :");
        System.out.printf("이름 %s \t 연락처 %s\n", name,phone);
    }
    public static void menuCartItemList() {

    }
    public static void menuCartClear() {

    }
    public static void menuCartAddItem() {

    }
    public static void menuCartRemoveItemCount() {

    }
    public static void menuCartRemoveItem() {

    }
    public static void menuCartBill() {

    }
    public static void menuExit() {
        System.out.println("프로그램이 종료됩니다");
    }

    public static void menuIntroduction(){
        System.out.println("****************************************************");
        System.out.println("       Welcome to Shopping Mall");
        System.out.println("       Welcome to Book Market!");
        System.out.println("****************************************************");
        System.out.println(" 1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기          6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기          8. 종료");
        System.out.println("****************************************************");
        System.out.print("메뉴 번호를 선택해주세요 ");
    }
}
