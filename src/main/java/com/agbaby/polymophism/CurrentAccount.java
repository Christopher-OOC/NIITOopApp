package com.agbaby.polymophism;

import java.util.Random;

public class CurrentAccount extends Account {
    private User user;

    public CurrentAccount(String fullName, String email, String pin) {
        user = new User(fullName, email);
        setPin(pin);
        setAccountNumber(new Random().nextLong(10000000000L) + "");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CurrentAccount{ " + "\n" +
                "accountNumber=" + getAccountNumber() + "\n" +
                "balance=" + getBalance() + "\n" +
                "pin=" + getPin() + "\n" +
                "transactionHistory=" + getTransactionHistory() + "\n" +
                "user=" + user +
                '}';
    }
}
