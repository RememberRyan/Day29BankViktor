package com.bank;

public abstract class AccountHolder {

    protected String name;
    protected Account account;

    //no practice with abstract classes
    public abstract void addMoney (double money);

    public abstract void withdrawMoney (double money);


    //getters

    //get the name of the account
    public String getName(){
        return name;
    }

    //retrieve balance of the chosen account
    public double getAccountBalance(){
        return this.account.getBalance();
    }

}
