package com.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Designing user interaction to play with the application

        Bank bank = new Bank("Cardasia Federal");
        Scanner scanner = new Scanner(System.in);

        //dummy personal account
        bank.addPersonalAccount("Damar");


        // Progression through the project now means we are no longer storing data on / using User.class
//        User user = new User("pa55w0rd",
//                "Gul Dukat",
//                "Tallinn",
//                "+372 1423 6324",
//                "GulDukat@gmail.com",
//                "ForMySons",
//                "ForAllOurSons");
//        user.addNewAccount("EUR");

        //Our creation of user above is a separate thing
        //bank.addUser(user);


        //while (true) allows us to add a case in order to exit our application2
        while (true) {
            //Interaction menu in command line
            //moved within while loop this needs to be repeated for the users
            System.out.println();
            System.out.println("Welcome to " + bank.getBankName() + " bank!");
            System.out.println("Choose your action:");
            System.out.println("1 - Create a new Account");
            System.out.println("2 - Add money to the selected account");
            System.out.println("3 - Withdraw money from your account");
            System.out.println("4 - Check your account balance");
            System.out.println("5 - Display user details");
            System.out.println("6 - Display bank details");
            System.out.println("0 - Exit application");

            //actions carried out based on user's choice
            int userOption = scanner.nextInt();

            switch (userOption) {
                case 0:
                    return;

                /*
                classwork/homework: implement case 1:
                When completed correctly, Option 5 should also1
                only 'print' the newly created user account.

                 */
                case 1:
                    //Creating a new personal account
                    System.out.println("Decide what type of account you wish to open");
                    System.out.println("==================================================");
                    System.out.println("1. A Personal account");
                    System.out.println("2. A Business account");
                    System.out.println("3. A Fund account");
                    System.out.println("Please enter your choice");
                    int choiceOfAccountType = scanner.nextInt();

                    System.out.println("Please input the name for this new account");
                    //nested switch case for a choice of type of account
                    String nameForAccountType = scanner.next();
                    switch (choiceOfAccountType) {
                        case 1:
                            bank.addPersonalAccount(nameForAccountType);
                            break;

                        case 2:
                            bank.addBusinessAccount(nameForAccountType);
                            break;

                        case 3:
                            bank.addFundAccount(nameForAccountType);
                            break;

                        default:
                            System.out.println("You've made an error in your selection process");
                            break;

                    }
                    break;


//                    System.out.println("Creating a new user account");
//                    System.out.println("================================");
//
//                    //Read in all information and THEN pass it to the constructor. Ignore underline errors from IntelliJ
//                    System.out.println();
//                    System.out.println("Please create a user password:");
//                    String password = scanner.next();
//                    System.out.println("Please enter your full name:");
//                    String fullName = scanner.next();
//                    System.out.println("Please enter your address");
//                    String address = scanner.next();
//                    System.out.println("Please enter your phone number");
//                    String phoneNumber = scanner.next();
//                    System.out.println("Please enter your email");
//                    String email = scanner.next();
//                    System.out.println("Please enter your secret question");
//                    String secretQuestion = scanner.next();
//                    System.out.println("Please enter your secret answer");
//                    String answerForSecretQuestion = scanner.next();
//                    User users = new User(password, fullName, address, phoneNumber, email, secretQuestion, answerForSecretQuestion);
//                    bank.addUser(users);
//                    System.out.println("Please type your currency");
//                    String currency = scanner.next();
//                    users.addNewAccount(currency);

                //add money to a selected account
                case 2:
                    System.out.println("Please input the name on your account");
                    String accountNameDeposit = scanner.next();
                    System.out.println("How much money would you like to deposit?");
                    double moneyDeposit = scanner.nextDouble();
                    bank.addMoneyToAccount(accountNameDeposit, moneyDeposit);
                    System.out.println("The total balance of user is: " + bank.usersBalance(accountNameDeposit));
                    break;

                //withdraw money from a selected account by name
                case 3:
                    System.out.println("Please input the name on your account");
                    String accountNameWithdraw = scanner.next();
                    System.out.println("How much would you like to withdraw?");
                    double moneyWithdraw = scanner.nextDouble();
                    bank.withdrawMoneyFromAccount(accountNameWithdraw, moneyWithdraw);
                    System.out.println("The total balance of user is: " + bank.usersBalance(accountNameWithdraw));
                    break;

                //check balance of selected account by name
                case 4:
                    System.out.println("Please input the name of your account");
                    String accountNameBalance = scanner.next();
                    bank.usersBalance(accountNameBalance);
                    System.out.println("Your account balance is currently: " + bank.usersBalance(accountNameBalance));
                    break;

                    //show user details
                case 5:
                    System.out.println("Enter the name as it appears on your account");
                    String nameForUserDetails = scanner.next();
                    bank.printUser(nameForUserDetails);
                    break;

                    //display bank details
                case 6:
                    System.out.println(bank);
                    break;

                default:
                    System.out.println("You have incorrectly chosen from the menu. \n Please contact admin for help");
                    break;

//                case 4:
//                    System.out.println("Enter userId");
//                    String userId = scanner.next();
//                    System.out.println("Add account Id");
//                    Long accountId = scanner.nextLong();
//                    System.out.println("Add amount of money to deposit");
//                    double money = scanner.nextDouble();
//                    bank.addMoneyToUser(userId, accountId, money);
//                    System.out.println("Total balance");
//                    System.out.println(bank.totalAmountOfUser(userId) + "\n" + "\n" + "Please choose another option.");
//                    break;
//
//                // further homework: implement money withdrawal from bank
//                case 5:
//                    System.out.println("Enter userId");
//                    String userIdWithDraw = scanner.next();
//                    System.out.println("Add account Id");
//                    Long accountIdWithDraw = scanner.nextLong();
//                    System.out.println("Add deduct of money from account");
//                    double moneyWithDraw = scanner.nextDouble();
//                    bank.withdrawMoneyFromUser(userIdWithDraw, accountIdWithDraw, moneyWithDraw);
//                    System.out.println("Total balance after withdrawal");
//                    System.out.println(bank.totalAmountOfUser(userIdWithDraw) + "\n" + "\n" + "Please choose another option.");
//                    break;
//
//                //Display just one account specified by userID
//                case 6:
//                    System.out.println("Please enter userId");
//                    String idOfUser = scanner.next();
//                    System.out.println(bank.totalAmountOfUser(idOfUser));
//                    break;

                //Displays all account details held
//                case 6:
//                    System.out.println(bank);
//                    break;
//
//                default:
//                    break;
            }
        }
    }

}

