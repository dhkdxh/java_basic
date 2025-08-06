package day12.assignment.inheritance;

public class Alcohol extends Drink{
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper){
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle(){
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    public void printData(){
        System.out.printf("%s(%.1f)\t\t%d\t%d\t\t%d",this.getName(), this.alcper, this.getPrice(), this.getCount(), this.getTotalPrice());
    }
}
