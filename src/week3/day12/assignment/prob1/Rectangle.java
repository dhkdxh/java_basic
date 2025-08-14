package week3.day12.assignment.prob1;

public class Rectangle {
    private int width;
    private int height;
    private String color;
    private int area;

    public Rectangle(){
        this.width=0;
        this.height=0;
        this.area = 0;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void calculateArea(){
        this.area = this.height * this.width;
    }
}
