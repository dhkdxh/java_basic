package week3.morningtest;

public class Account {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    private int balance;
    private String name;
    private String accountNum;

    public Account(){
        balance = 0;
        name="";
        accountNum="";
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && balance <=MAX_BALANCE){
            this.balance += balance;
        }
    }
}
