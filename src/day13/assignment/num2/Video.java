package day13.assignment.num2;

public class Video extends Content{
    private String genre;

    public Video(String title, String genre){
        super(title);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void totalPrice(){
        switch(genre){
            case "new" -> this.setPrice(2000);
            case "comic" ->this.setPrice(1500);
            case "child"-> this.setPrice(1000);
            default -> this.setPrice(500);
        }
    }
}
