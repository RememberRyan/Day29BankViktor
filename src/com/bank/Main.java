package com.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Designing user interaction to play with the application

        Bank bank = new Bank("A1eks");
        Scanner scanner = new Scanner(System.in);


        User user = new User("123",
                "Aleks Kosiak",
                "Tallinn",
                "+372 1423 6324",
                "A1eksKosyak@gmail.com",
                "Question",
                "Answer");
        user.addNewAccount("EUR");

        //Our creation of user above is a seperate thing
        bank.addUser(user);

        //Interaction menu in command line
        System.out.println("Welcome to " + bank.getBankName() + " bank!");
        System.out.println("Choose your action:");
        System.out.println("1 - create new user;");
        System.out.println("2 - add money to selected account of your user;");
        System.out.println("3 - withdraw money from users account;");
        System.out.println("4 - check total amount of money of your user");
        System.out.println(bank);

        //actions carried out based on
        int userOption = scanner.nextInt();
//        System.out.println();

        switch (userOption) {
            case 1:
                break;


            case 2:
                System.out.println("Enter userId");
                String userId = scanner.next();
                System.out.println("Add account Id");
                Long accountId = scanner.nextLong();
                System.out.println("Add amount of money to deposit");
                double money = scanner.nextDouble();
                bank.addMoneyToUser(userId, accountId, money);
                System.out.println("Total amount of users");
                System.out.println(bank.totalAmountOfUser(userId));
                break;

            case 3:
                break;

                //
                case 4:
                System.out.println("Please enter userId");
                String idOfUser = scanner.nextLine();
                System.out.println(bank.totalAmountOfUser(idOfUser));
                break;
            default:
                break;
        }


    }


}

