package com.bank;

public abstract class AccountHolder {

    protected String name;
    protected Account account;

    //no practice with abstract classes
    public abstract void addMoney (double money);

    public abstract void withdrawMoney (double money);


}
