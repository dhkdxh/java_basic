package BookMarket.cart;

import BookMarket.bookitem.Book;

public class Cart implements CartInterface{

    static final int NUM_BOOK = 3;
    public CartItem[] mCartItem = new CartItem[NUM_BOOK];
    public static int mCartCount = 0;

    public Cart() {}


    @Override
    public void printBookList(Book[] booklist) {
        for(int i = 0; i < booklist.length; i++) {
            System.out.print(booklist[i].getBookId()+ " | ");
            System.out.print(booklist[i].getName()+ " | ");
            System.out.print(booklist[i].getUnitPrice()+ " | ");
            System.out.print(booklist[i].getAuthor()+ " | ");
            System.out.print(booklist[i].getDescription()+ " | ");
            System.out.print(booklist[i].getCategory()+ " | ");
            System.out.print(booklist[i].getReleaseDate());
            System.out.println();
        }
    }

    @Override
    public boolean isCartInBook(String id) {
        boolean flag = false;
        for(int i=0; i<mCartCount; i++){
            if(id == mCartItem[i].getBookID()){
                mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book p) {
        mCartItem[mCartCount++] = new CartItem(p);
    }

    @Override
    public void removeCart(int numid) {
        CartItem[] cartItem = new CartItem[NUM_BOOK];
        int num = 0;

        for(int i = 0; i<mCartCount; i++){
            if(numid != i) cartItem[num++] = mCartItem[i];
        }

        mCartCount = num;
        mCartItem = cartItem;
    }

    @Override
    public void deleteBook() {
        mCartItem = new CartItem[NUM_BOOK];
        mCartCount = 0;
    }

    public void printCart() {
        System.out.println("장바구니 상품 목록 :");
        System.out.println("------------------------------------");
        System.out.println("     도서ID \t|     수량 \t|     합계");

        for(int i=0; i<mCartCount; i++){
            System.out.print("    "+mCartItem[i].getBookID()+" \t| ");
            System.out.print("    "+mCartItem[i].getQuantity()+" \t| ");
            System.out.print("    "+mCartItem[i].getTotalPrice());
            System.out.println();
        }
        System.out.println("------------------------------------");

    }
}

