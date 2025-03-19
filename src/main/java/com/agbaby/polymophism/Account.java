package com.agbaby.polymophism;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<>();
    private String pin;

    public Account() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;

            Transaction transaction = new Transaction(
                    UUID.randomUUID().toString(),
                    "DEPOSIT",
                    amount,
                    new Date()
            );

            this.transactionHistory.add(transaction);
        }
    }


    public void withdraw(double amount) {
        if ((this.balance >= amount)) {
            this.balance = this.balance - amount;
            Transaction transaction = new Transaction(
                    UUID.randomUUID().toString(),
                    "WITHDRAW",
                    amount,
                    new Date()
            );

            this.transactionHistory.add(transaction);
        }
        else {
            System.out.println("You cannot eat your cake and have it!");
        }
    }

    public void transfer(Account account, double amount) {
        if (this.balance >= amount) {
            account.balance = account.balance + amount;

            this.balance = this.balance - amount;
            Transaction from = new Transaction(
                    UUID.randomUUID().toString(),
                    "WITHDRAW",
                    amount,
                    new Date()
            );
            Transaction to = new Transaction(
                    UUID.randomUUID().toString(),
                    "DEPOSIT",
                    amount,
                    new Date()
            );

            this.transactionHistory.add(from);
            account.transactionHistory.add(to);

        }
    }
}
