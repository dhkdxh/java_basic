public class Account {
    private String accNo;
    private int balance;

    public Account(){
        balance = 0;
    }

    public void setAccNo(String number){
        this.accNo = number;
        System.out.println(this.getAccNo()+" 계좌가 개설되었습니다.");
    }

    public void save(int money){
        this.balance += money;
        System.out.println(this.getAccNo()+" 계좌에 "+money+"만원이 입금되었습니다.");
    }

    public void deposit(int money){
        this.balance -= money;
        System.out.println(this.getAccNo()+" 계좌에 "+money+"만원이 출금되었습니다.");
    }

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }
}
