package com.bank;

public class UserAccountHolder extends AccountHolder {


    public UserAccountHolder(String name) {
        this.name = name;
        this.account = new Account("EUR");
    }


    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    // 5% withdrawal fee applied
    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money * 1.05);
    }

    @Override
    public String toString() {
        return "UserAccountHolder{" +
                "account=" + account +
                ", name='" + name + '\'' +
                '}';
    }
}
