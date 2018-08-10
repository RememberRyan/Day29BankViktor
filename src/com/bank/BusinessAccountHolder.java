package com.bank;

public class BusinessAccountHolder extends AccountHolder {

    //Constructor: Create name and new account in EU
    public BusinessAccountHolder(String name) {
        this.name = name;
        this.account = new Account("EUR");
    }

    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    @Override
    public String toString() {
        return "BusinessAccountHolder{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }

    // 3% withdrawal fee
    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money * 1.03);
    }
}
