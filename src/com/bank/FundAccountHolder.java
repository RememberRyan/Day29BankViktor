package com.bank;

public class FundAccountHolder extends AccountHolder {

    //Constructor: Create name and new account in EU
    public FundAccountHolder(String name) {
        this.name = name;
        this.account = new Account("EUR");
    }

    @Override
    public String toString() {
        return "FundAccountHolder{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }

    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    // 0% withdrawal fee
    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money);
    }
}
