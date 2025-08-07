package day13.assignment.num2;

public class Coffee extends Beverage{
    static int amount;

    public Coffee(String name){
        super(name);
        amount++;
        calcPrice();
    }

    public void calcPrice(){
        String menu = this.getName();

        if(menu.equals("Americano")){
            price = 1500;
        }else if(menu.equals("CafeLatte")){
            price = 2500;
        }else if(menu.equals("Cappuccino")){
            setPrice(3000);
        }
    }

    public void print(){
        System.out.printf("판매 음료는 %s이며, 가격은 %d\n", this.getName(), this.price);
    }
}
