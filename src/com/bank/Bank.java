package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    //properties
    private List<User> users;
    private String bankName;



    // constructor
    public Bank(String bankName) {

        this.bankName = bankName;
        this.users = new ArrayList<>();
    }

    //methods
    public String getBankName() {
        return bankName;
    }

    //user comes to the bank and we create a new user
    public void addUser(String password, String fullName, String address,
                        String phoneNumber, String email, String secretQuestion,
                        String answerToSecretQuestion) {
        User newUser = new User(password,
                fullName, address, phoneNumber, email, secretQuestion, answerToSecretQuestion);
        users.add(newUser);
    }

    //if user already exists from another bank and we add them to this bank branch
    public void addUser(User user) {
        users.add(user);
    }


    //total money for a user, by userID
    //traverses sequentially through users and matches Id
    public Double totalAmountOfUser(String userId) {
        for (User user: users){
            if (user.getId().equals(userId)){
                return user.totalAmountOfMoney();
            }
        }
        return null;
    }

    //adding money to a user's account
    public void addMoneyToUser(String userId, long accountId, double amountOfMoney){
        for (User user: users) {
            if (userId.equals(user.getId())){
                user.addMoneyToAccount(accountId, amountOfMoney);
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + users +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}