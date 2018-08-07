package com.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    //package-private by default
//
//    //UUID java generates random strings
    private String id; //= UUID.randomUUID().toString();
    private String password;
    private String fullName;
    private String address;
    private List<Account> accounts;
    private String phoneNumber;
    private String email;
    private String secretQuestion;
    private String answerForSecretQuestion;

    public User(String password,
                String fullName,
                String address,
                //decided as class to remove this
                //this.accountNumber = accountNumber;
                String phoneNumber,
                String email,
                String secretQuestion,
                String answerForSecretQuestion) {

        //generate create new IDs
        this.id = UUID.randomUUID().toString();
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.answerForSecretQuestion = answerForSecretQuestion;
        this.accounts = new ArrayList<>();
    }

    //aggregated money of all users accounts in their name
    public double totalAmountOfMoney() {

        //accounts is our list of all accounts
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return  sum;
//
//        //alternative way to get the result with index solution.
//        double sumWithIndex = 0;
//        for (int i = 0; i < accounts.size(); i++) {
//            sumWithIndex += accounts.get(i).getBalance();
//        }
//        return sumWithIndex;

    }

    //add money to the account
    public void addMoney (long accountId, double amountOfMoney){
//        //ryan attempt
//        for (User accountId: accountId){
//            if (user.accountId().equals(accountId)){
//                addMoney.amountOfMoney;
//            }
//        }
//        return null;
    }

    public void addNewAccount(String currency) {
        Account newAccount = new Account(currency);
        accounts.add(newAccount);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getAnswerForSecretQuestion() {
        return answerForSecretQuestion;
    }

    public void setAnswerForSecretQuestion(String answerForSecretQuestion) {
        this.answerForSecretQuestion = answerForSecretQuestion;
    }

    //class exercise to add money to the account
    public void addMoneyToAccount(long accountId, double amountOfMoney){
        for (Account account :accounts) {
            if (account.getAccountNumber() == accountId) {
                account.addMoney(amountOfMoney);
                //like a 'break', we use empty return to guarantee we only add money once!
                return;
            }
        }
    }

    //generated methodToString for printout
//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", password='" + password + '\'' +
//                ", fullName='" + fullName + '\'' +
//                ", address='" + address + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", email='" + email + '\'' +
//                ", secretQuestion='" + secretQuestion + '\'' +
//                ", answerForSecretQuestion='" + answerForSecretQuestion + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", accounts=" + accounts +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", answerForSecretQuestion='" + answerForSecretQuestion + '\'' +
                '}';
    }
}