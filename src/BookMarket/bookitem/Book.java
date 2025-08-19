package BookMarket.bookitem;

public class Book extends Item{
    private String author;
    private String description;
    private String category;
    private String releaseDate;

    public Book(String bookId, String name, int unitPrice){
        super(bookId, name, unitPrice);
    }

    public Book(String bookId, String name, int unitPrice, String author, String description, String category, String releaseDate){
        super(bookId, name, unitPrice);
        this.author = author;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
    }


    @Override
    public String getBookId() {
        return this.bookId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getUnitPrice() {
        return this.unitPrice;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    @Override
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
