package day12.assignment.testRectangle;

public class Rectangle {
    private int width;
    private int length;
    private String color;

    public Rectangle(){
        this.width=0;
        this.length=0;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public String getColor(){
        return this.color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length= length;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int area(){
        return this.getLength() * this.getWidth();
    }

    public int perimeter(){
        return 2*(this.getLength()+this.getWidth());
    }
}
