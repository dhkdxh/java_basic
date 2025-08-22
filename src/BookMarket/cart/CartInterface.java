package BookMarket.cart;

import BookMarket.bookitem.Book;
import java.util.ArrayList;

public interface CartInterface {
    void printBookList(ArrayList<Book> p);

    boolean isCartInBook(String id);

    void insertBook(Book p);

    void removeCart(int numid);

    void deleteBook();
}
