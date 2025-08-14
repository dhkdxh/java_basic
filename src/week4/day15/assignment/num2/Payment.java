package week4.day15.assignment.num2;

public abstract class Payment implements Payable{
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice){
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public abstract void pay() throws PayException;
}
