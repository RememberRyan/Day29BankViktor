package com.bank;

public class UserAccountHolder extends AccountHolder {


    public UserAccountHolder(String name) {
        this.name = name;
        this.account = new Account ("E-U-R");
    }


    @Override
    public void addMoney(double money) {
    this.account.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money) {
    this.account.withdrawMoney(money * 1.05);
    }
}
