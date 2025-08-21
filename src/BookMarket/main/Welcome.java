package BookMarket.main;

import BookMarket.bookitem.Book;
import BookMarket.cart.Cart;
import BookMarket.member.Admin;
import BookMarket.member.User;
import BookMarket.exception.CartException;

import java.io.*;
import java.util.*;
import java.text.*;

public class Welcome {
    static Scanner sc = new Scanner(System.in);
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    static User mUser;
    static Cart mCart = new Cart();

    public static void main(String[] args) {

        Book[] mBookList;
        int mTotalBook = 0;

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 연락처를 입력하세요 : ");
        int phone = Integer.parseInt(sc.nextLine());

        mUser = new User(name, phone);

        int input = 0;
        Outter:
        while (input != 8) {
            menuIntroduction();

            try {
                input = sc.nextInt();

                switch (input) {
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
                        mTotalBook = totalFileToBookList();
                        mBookList = new Book[mTotalBook];
                        menuCartAddItem(mBookList);
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
                    case 9:
                        menuAdminLogin();
                        break;
                }
            } catch (CartException e) {
                System.out.println(e.getMessage());
                break Outter;
            }catch(Exception e) {
                System.out.println("올바르지 않은 메뉴 선택으로 종료합니다.");
                break Outter;
            }
        }
    }

    public static void menuGuestInfo() {
        System.out.println("현재 고객 정보 :");
        System.out.printf("이름 %s \t 연락처 %s\n", mUser.getName(), mUser.getPhone());
    }

    public static void menuCartItemList() {
        if (Cart.mCartCount >= 0) {
            mCart.printCart();
        }
    }

    public static void menuCartClear() throws CartException {
        if (Cart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다.");
        else {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N");
            String str = sc.nextLine();

            if (str.toUpperCase().equals("Y")) {
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                mCart.deleteBook();
            }
        }
    }

    public static void menuCartAddItem(Book[] booklist) {
        System.out.println("장바구니에 항목 추가하기 : ");
        BookList(booklist);
        mCart.printBookList(booklist);

        while (true) {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
            String input = sc.nextLine();

            int numId = -1;
            boolean flag = false;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (input.equals(booklist[i].getBookId())) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하겠습니까? Y | N");
                input = sc.nextLine();

                if (input.toUpperCase().equals("Y")) {
                    System.out.println(booklist[numId].getBookId() + " 도서가 장바구니에 추가되었습니다.");
                    if (!mCart.isCartInBook(booklist[numId].getBookId())) {
                        mCart.insertBook(booklist[numId]);
                    }
                    break;
                } else System.out.println("다시 입력해주세요.");
            }
        }
    }
    public static void menuCartRemoveItemCount () {

    }

    public static void menuCartRemoveItem () throws CartException {
        if (Cart.mCartCount == 0) throw new CartException("장바구니에 항목이 없습니다.");
        else {
            menuCartItemList();
            boolean quit = false;
            while (!quit) {
                System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                String str = sc.nextLine();
                boolean flag = false;
                int numId = -1;

                for (int i = 0; i < Cart.mCartCount; i++) {
                    if (str.equals(mCart.mCartItem[i].getBookID())) {
                        numId = i;
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                    str = sc.nextLine();
                    if (str.toUpperCase().equals("Y")) {
                            System.out.println(mCart.mCartItem[numId].getBookID() + " 장바구니에서 도서가 삭제되었습니다.");
                            mCart.removeCart(numId);
                    }
                    quit = true;
                } else System.out.println("다시 입력해 주세요.");
            }
        }
    }
        public static void menuCartBill () throws CartException {
            if(Cart.mCartCount == 0) {
                throw new CartException("장바구니에 항목이 없습니다.");
            }
            System.out.println("배송받을 분은 고객 정보와 같습니까? Y | N");
            String str = sc.nextLine();

            if(str.toUpperCase().equals("Y")) {
                System.out.print("배송지를 입력해주세요 ");
                String address = sc.nextLine();
                printBill(mUser.getName(), String.valueOf(mUser.getPhone()), address);
            }else{
                System.out.print("배송받을 고객명을 입력하세요 ");
                String name = sc.nextLine();
                System.out.print("배송받을 고객의 연락처를 입력하세요 ");
                String phone = sc.nextLine();
                System.out.print("배송받을 고개의 배송지를 입력해주세요 ");
                String address = sc.nextLine();
                printBill(name, phone, address);
            }
        }

        public static void printBill(String name, String phone, String address) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String strDate = formatter.format(date);
            System.out.println();
            System.out.println("------------------배송받을 고객 정보-------------------");
            System.out.println("고객명 : "+ name + "   \t\t연락처 : "+ phone);
            System.out.println(" 배송지 : "+ address + "\t\t발송일 : "+ strDate);

            mCart.printCart();

            int sum = 0;
            for(int i=0; i<Cart.mCartCount; i++) {
                sum += mCart.mCartItem[i].getTotalPrice();
            }

            System.out.println("\t\t\t주문 총금액 : "+sum+"원\n");
            System.out.println("-----------------------------------------------------");
        }

        public static void menuExit () {
            System.out.println("프로그램이 종료됩니다");
        }

        public static void menuIntroduction () {
            System.out.println("****************************************************");
            System.out.println("       Welcome to Shopping Mall");
            System.out.println("       Welcome to Book Market!");
            System.out.println("****************************************************");
            System.out.println(" 1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
            System.out.println(" 2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기");
            System.out.println(" 3. 장바구니 비우기          6. 장바구니의 항목 삭제하기");
            System.out.println(" 7. 영수증 표시하기          8. 종료");
            System.out.println(" 9. 관리자 로그인");
            System.out.println("****************************************************");
            System.out.print("메뉴 번호를 선택해주세요 ");
        }

        public static void BookList (Book[] booklist){
            setFileToBookList(booklist);
        }

        public static boolean isCartInBook (String bookId){
            return mCart.isCartInBook(bookId);
        }

        public static void menuAdminLogin () {
            System.out.println("관리자 정보를 입력하세요.");

            System.out.print("아이디 : ");
            String adminId = sc.next();
            System.out.print("비밀번호 : ");
            String adminPW = sc.next();

            Admin admin = new Admin(mUser.getName(), mUser.getPhone());
            if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
                String[] writeBook = new String[7];
                System.out.println("도서 정보를 추가하겠습니까? Y | N");
                String str = sc.nextLine();

                if(str.toUpperCase().equals("Y")) {
                    Date date = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmss");
                    String strDate = formatter.format(date);
                    writeBook[0] = "ISBN" + strDate;
                    System.out.println("도서ID : " + writeBook[0]);
                    System.out.print("도서명 : ");
                    writeBook[1] = sc.nextLine();
                    System.out.print("가격: ");
                    writeBook[2] = sc.nextLine();
                    System.out.print("저자 : ");
                    writeBook[3] = sc.nextLine();
                    System.out.print("설명 : ");
                    writeBook[4] = sc.nextLine();
                    System.out.print("분야 : ");
                    writeBook[5] = sc.nextLine();
                    System.out.print("출판일 : ");
                    writeBook[6] = sc.nextLine();

                     try{
                         FileWriter fw = new FileWriter("book.txt", true);

                         for(int i=0; i<7; i++){
                             fw.write(writeBook[i] + "\n");
                             fw.close();
                             System.out.println("새 도서 정보가 저장되었습니다.");
                         }
                     } catch (Exception e) {
                         System.out.println(e.getMessage());
                     }

                }else{
                    System.out.println("이름 " + admin.getName() + "  연락처 " + admin.getPhone());
                    System.out.println("아이디 " + admin.getId() + "  비밀번호 " + admin.getPassword());
                }
            } else System.out.println("관리자 정보가 일치하지 않습니다.");
        }

        public static int totalFileToBookList(){
            try{
                FileReader fr = new FileReader("book.txt");
                BufferedReader reader = new BufferedReader(fr);
                String str;
                int num = 0;

                while((str=reader.readLine()) != null){
                    if(str.contains("ISBN")) num++;
                }

                reader.close();
                fr.close();
                return num;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return 0;
        }

        public static void setFileToBookList (Book[] booklist){
            try{
                FileReader fr = new FileReader("book.txt");
                BufferedReader reader = new BufferedReader(fr);

                String str;
                String[] book = new String[7];
                int count = 0;

                while((str=reader.readLine()) != null){
                    if(str.contains("ISBN")){
                        book[0] = str;
                        book[1] = reader.readLine();
                        book[2] = reader.readLine();
                        book[3] = reader.readLine();
                        book[4] = reader.readLine();
                        book[5] = reader.readLine();
                        book[6] = reader.readLine();
                    }
                }

                booklist[count++] = new Book(book[0],book[1],Integer.parseInt(book[2]),book[3],book[4],book[5],book[6]);
                reader.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}