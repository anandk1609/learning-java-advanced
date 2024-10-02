package com.learning.bank;

import java.util.Scanner;

public class BankAccount {

    private double balance;
    private long accountNumber;
    public final String user = "Anand";
    Scanner input = new Scanner(System.in);
     
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountNumber(long accNumber) {
        if(accNumber < 10) {
            System.out.println("Please enter a valid account number");
            return;
        }
        this.accountNumber = accNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void withdraw(double amount) {
        if(amount < 0 ) return;
        else if(amount <= balance) {
            balance = balance - amount;
            balance = Math.round(balance * 100.0)/ 100.0;
            System.out.println("You have withdrawn $" +amount+ " from your acount " +truncateAccount());
        }
        System.out.println("Would you like to see your new balance:");
        String option = input.nextLine();
        if(option.equalsIgnoreCase("Y")) {
            System.out.println("Your balance is $" +balance);
        } else return;
    }
    
    private String truncateAccount() {
        String accString = Long.toString(accountNumber);
        String masked = "XXXXXX" + accString.substring(6);
        return masked;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You have deposited $" +amount+ " in your acount " +truncateAccount());
        System.out.println("Would you like to see your new balance:");
        String option = input.nextLine();
        if(option.equalsIgnoreCase("Y")) {
            System.out.println("Your balance is $" +balance);
        } else return;
    }

    public static void main(String[] args) {
        BankAccount newUser = new BankAccount();
        newUser.setAccountNumber(4007169807L);
        newUser.setBalance(987.54);

        System.out.println(newUser.getBalance());

        newUser.withdraw(980.50);
        newUser.deposit(1000);
    }
}
