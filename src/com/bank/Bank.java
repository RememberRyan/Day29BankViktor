package com.bank;

import java.util.List;

public class Bank {

    //properties
    private List<User> users;
    private String bankName;

    // constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    //methods

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


}