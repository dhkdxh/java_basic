package BookMarket;

import java.util.*;

public class Welcome {
    static Scanner sc = new Scanner(System.in);
    static String name;
    static String phone;
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;

    public static void main(String[] args) {

        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

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
                    menuCartAddItem(mBook);
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
        System.out.println("장바구니 상품 목록 :");
        System.out.println("------------------------------------");
        System.out.println("     도서Id \t|     수량 \t|     합계");
        for(int i=0; i<mCartCount; i++){
            System.out.print("    "+mCartItem[i].getBookID()+" \t| ");
            System.out.print("    "+mCartItem[i].getQuantity()+" \t| ");
            System.out.print("    "+mCartItem[i].getTotalPrice()+" \t| ");
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
    public static void menuCartClear() {

    }
    public static void menuCartAddItem(String[][] book) {
        System.out.println("장바구니에 항목 추가하기 : ");
        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.print(book[i][j]+" | ");
            }
            System.out.println();
        }

        while(true){
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
            String input = sc.nextLine();

            int numId = -1;
            boolean flag=false;

            for(int i=0; i<NUM_BOOK; i++){
                if(input.equals(book[i][0])){
                    numId = i;
                    flag=true;
                    break;
                }
            }

            if(flag){
                System.out.println("장바구니에 추가하겠습니까? Y | N");
                input = sc.nextLine();

                if(input.toUpperCase().equals("Y")){
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                    if(!isCartInBook(book[numId][0])) mCartItem[mCartCount++] = new CartItem(book[numId]);
                }
                break;
            }else System.out.println("다시 입력해주세요.");

        }

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

    public static void BookList(String[][] book){

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }

    public static boolean isCartInBook(String bookId){
        for(int i=0; i<mCartCount; i++){
            if(bookId == mCartItem[i].getBookID()){
                mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
                return true;
            }
        }
        return false;
    }
}
