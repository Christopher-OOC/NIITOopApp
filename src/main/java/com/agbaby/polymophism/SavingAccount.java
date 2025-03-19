package com.agbaby.polymophism;

import java.util.Random;

public class SavingAccount extends Account {
    private User user;
    private double interestRate;

    public SavingAccount(String fullName, String email, String pin, double interestRate) {
        user = new User(fullName, email);
        setPin(pin);
        setAccountNumber(new Random().nextLong(10000000000L) + "");
        this.interestRate = interestRate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
