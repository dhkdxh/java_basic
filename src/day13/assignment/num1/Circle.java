package day13.assignment.num1;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public void calculationArea(){
        this.setArea(Math.PI * radius * radius);
    }

    public void print(){
        System.out.print("원의 ");
        super.print();
        System.out.println();
    }
}
