package week3.day13.assignment.num2;

public class Tea extends Beverage{
    static int amount;

    public Tea(String name){
        super(name);
        amount++;
        calcPrice();
    }

    public void calcPrice(){
        String menu = this.getName();

        if(menu.equals("lemonTea")){
            setPrice(1500);
        }else if(menu.equals("ginsengTea")){
            setPrice(2000);
        }else if(menu.equals("redginsengTea")){
            setPrice(2500);
        }
    }

    public void print(){
        System.out.printf("판매 음료는 %s이며, 가격은 %d\n", this.getName(), this.price);
    }
}
