package day08;

public class BookMain {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b);
        b.title = "전지적독자시점";
        b.author = "싱숑";
        b.company = "비채";
        b.price = 13500;

        System.out.println(b.title);
        System.out.println(b.company);
        System.out.println(b.author);
        System.out.println(b.price);

        Book[] fantasy = new Book[3];
        for(Book i : fantasy){
            i = new Book();
        }//새로운 Book object를 index마다 create 해줘야함
        //참조 접근은 간접 접근임

    }
}
