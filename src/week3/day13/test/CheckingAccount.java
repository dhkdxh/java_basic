package week3.day13.test;

public class CheckingAccount extends Account{
    private String CardNo;

    public CheckingAccount(String accid, long balance, String ownerName,String cardNo){
        super(accid, balance,ownerName);
        this.CardNo = cardNo;
    }

    public void pay(String cardNo, long amount){
        if(!cardNo.equals(this.CardNo)) {System.out.println("지불이 불가능합니다."); return;}
        if(amount > super.getBalance()) {System.out.println("지불이 불가능합니다."); return;}

        super.setBalance(super.getBalance()-amount);
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        this.CardNo = cardNo;
    }

    public void calcRate(){

    }
}
