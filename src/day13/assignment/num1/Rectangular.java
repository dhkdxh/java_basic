package day13.assignment.num1;

public class Rectangular extends Shape{
    private double width;
    private double height;

    public Rectangular(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    public void calculationArea(){
        this.setArea(width*height);
    }

    public void print(){
        System.out.print("직사각형의 ");
        super.print();
        System.out.println();
    }
}
