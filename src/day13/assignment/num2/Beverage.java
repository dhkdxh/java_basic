package day13.assignment.num2;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name){
        this.name = name;
    }

    public abstract void calcPrice();

    public void print(){
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
