package week3.day13.assignment.num1;

public abstract class Shape {
    protected double area;
    private String name;

    public Shape(){
        this.area = 0.0;
        this.name = "";
    }

    public Shape(String name){
        this.name = name;
    }

    public abstract void calculationArea();

    public void print(){
        System.out.print("면적은 "+ this.area);
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }
}
