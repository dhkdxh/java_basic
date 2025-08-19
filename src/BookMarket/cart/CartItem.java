package BookMarket.cart;

import BookMarket.bookitem.Book;

public class CartItem {
    //private String[] itemBook = new String[7];
    private Book itemBook;
    private String bookID;
    private int quantity;
    private int totalPrice;

    public CartItem(){
        this.bookID="";
        this.quantity = 0;
        this.totalPrice=0;
        this.itemBook=null;
    }

//    public CartItem(String[] book){
//        this.itemBook = book;
//        this.bookID = book[0];
//        this.quantity = 1;
//        updateTotalPrice();
//    }
//
//    public String[] getItemBook() {
//        return itemBook;
//    }
    public CartItem(Book booklist){
        this.itemBook=booklist;
        this.bookID = booklist.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    public Book getItemBook() {return this.itemBook;}

    public String getBookID() {
        return bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

//    public void setItemBook(String[] itemBook) {
//        this.itemBook = itemBook;
//    }

    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
        this.updateTotalPrice();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public void updateTotalPrice(){
        this.totalPrice = this.itemBook.getUnitPrice() * this.quantity;
//        totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
    }
}
