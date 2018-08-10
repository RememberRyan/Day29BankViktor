package com.bank;

import java.util.ArrayList;

public class Bank {

    //properties

    /* private List<User> users;
    Our bank used to have just one type of account for all users.
    Now we want multiple types of account holders.

    Attempt Polymorphism implementing <AccountHolder> below.
    <User> becomes <AccountHolder>
    users becomes accountHolders

    We use an ArrayList<> to hold account holders.
    Account holders aren't necessarily single individuals, they can be multiple people/corp/entities/etc
     */


    //
    private String bankName;
    private ArrayList<AccountHolder> accountHolders;


    // constructor
    public Bank(String bankName) {

        this.bankName = bankName;
        //this.users = new ArrayList<>();
        this.accountHolders = new ArrayList<>();
    }

    //methods
    public String getBankName() {
        return bankName;
    }

    /*
    POLYMORPHISM:
    New user methods need to be created because of polymorphism
     */

    //create new personal account
    public void addPersonalAccount(String name) {
        accountHolders.add(new UserAccountHolder(name));
    }

    //create new business account
    public void addBusinessAccount(String name) {
        accountHolders.add(new BusinessAccountHolder(name));
    }

    //create new fund account
    public void addFundAccount(String name) {
        accountHolders.add(new FundAccountHolder(name));
    }


    // balance display
    public double usersBalance(String nameOnAccount) {
        //https://www.baeldung.com/foreach-java
        /*
        for ( our <Type> | <object> : <list> )
        NB. remember that our Type has the first char capitalisation
         */
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.name.equals(nameOnAccount)) {
                return accountHolder.getAccountBalance();
            }
        }
        //the value of this return doesn't matter so long as it's type Double
        return -2;
    }

    // user display
    public void printUser(String fullName) {
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.name.equals(fullName)) {
                System.out.println(accountHolder);
            }
        }
    }

    // add money
    public void addMoneyToAccount(String name, double amountOfMoneyToAdd) {
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.name.equals(name)) {
                accountHolder.addMoney(amountOfMoneyToAdd);
            }
        }
    }


        // withdraw money
        public void withdrawMoneyFromAccount (String name, double amountOfMoneyToWithdraw) {
            for (AccountHolder accountHolder : accountHolders) {
                if (accountHolder.name.equals(name)){
                    accountHolder.withdrawMoney(amountOfMoneyToWithdraw);
                }
            }
        }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}


    //user comes to the bank and we create a new user
//    public void addUser(String password, String fullName, String address,
//                        String phoneNumber, String email, String secretQuestion,
//                        String answerToSecretQuestion) {
//        User newUser = new User(password,
//                fullName, address, phoneNumber, email, secretQuestion, answerToSecretQuestion);
//        users.add(newUser);
//    }

//    //if user already exists from another bank and we add them to this bank branch
//    public void addUser(User user) {
//        users.add(user);
//    }
//
//
//    //total money for a user, by userID
//    //traverses sequentially through users and matches Id
//    public Double totalAmountOfUser(String userId) {
//        for (User user: users){
//            if (user.getId().equals(userId)){
//                return user.totalAmountOfMoney();
//            }
//        }
//        return null;
//    }
//
//    //adding money to a user's account
//    public void addMoneyToUser(String userId, long accountId, double amountOfMoney){
//        for (User user: users) {
//            if (userId.equals(user.getId())){
//                user.addMoneyToAccount(accountId, amountOfMoney);
//            }
//        }
//    }
//
//    //withdrawing money to user's account
//    public void withdrawMoneyFromUser(String userId, long accountId, double amountOfMoney){
//        for (User user: users) {
//            if (userId.equals(user.getId())){
//                user.withdrawMoneyFromAccount(accountId, amountOfMoney);
//            }
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Bank{" +
//                "users=" + users +
//                ", bankName='" + bankName + '\'' +
//                '}';
//    }

