package BookMarket.cart;

import BookMarket.bookitem.Book;

import java.util.ArrayList;

public class Cart implements CartInterface{
    public ArrayList<CartItem> mCartItem = new ArrayList<>();
//    static final int NUM_BOOK = 3;
//    public CartItem[] mCartItem = new CartItem[NUM_BOOK];
    public static int mCartCount = 0;

    public Cart() {}


    @Override
    public void printBookList(ArrayList<Book> booklist) {
        for(int i = 0; i < booklist.size(); i++) {
            Book bookitem = booklist.get(i);
            System.out.print(bookitem.getBookId()+ " | ");
            System.out.print(bookitem.getName()+ " | ");
            System.out.print(bookitem.getUnitPrice()+ " | ");
            System.out.print(bookitem.getAuthor()+ " | ");
            System.out.print(bookitem.getDescription()+ " | ");
            System.out.print(bookitem.getCategory()+ " | ");
            System.out.print(bookitem.getReleaseDate());
            System.out.println();
        }
    }

    @Override
    public boolean isCartInBook(String id) {
        boolean flag = false;
        for(int i = 0; i<mCartItem.size(); i++){
            if(id.equals(mCartItem.get(i).getBookID())){
                mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity()+1);
                flag= true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book p) {

//        mCartItem[mCartCount++] = new CartItem(p);
        CartItem cartItem = new CartItem(p);
        mCartItem.add(cartItem);
        mCartCount = mCartItem.size();
    }

    @Override
    public void removeCart(int numid) {
        mCartItem.remove(numid);
        mCartCount = mCartItem.size();
    }

    @Override
    public void deleteBook() {
        //mCartItem = new CartItem[NUM_BOOK];
        mCartItem.clear();
        mCartCount = 0;
    }

    public void printCart() {
        System.out.println("장바구니 상품 목록 :");
        System.out.println("------------------------------------");
        System.out.println("     도서ID \t|     수량 \t|     합계");

        for(int i=0; i<mCartItem.size(); i++){
            System.out.print("    "+mCartItem.get(i).getBookID()+" \t| ");
            System.out.print("    "+mCartItem.get(i).getQuantity()+" \t| ");
            System.out.print("    "+mCartItem.get(i).getTotalPrice());
            System.out.println();
        }
        System.out.println("------------------------------------");

    }
}

