package week3.day13.test;

public class BookMgr {
    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for(int i=0; i<this.booklist.length; i++){
            System.out.println(booklist[i].getTitle());
        }
    }

    public void printTotalPrice(){
        System.out.print("전체 책 가격의 합 : ");
        int sum = 0;
        for(int i=0; i<this.booklist.length; i++){
            sum += booklist[i].getPrice();
        }
        System.out.print(sum + "\n");
    }
}

