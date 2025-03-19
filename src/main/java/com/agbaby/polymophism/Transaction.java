package com.agbaby.polymophism;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private String trasactionType;
    private double amount;
    private Date transactionDate;

    public Transaction() {

    }

    public Transaction(String transactionId, String trasactionType, double amount, Date transactionDate) {
        this.transactionId = transactionId;
        this.trasactionType = trasactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTrasactionType() {
        return trasactionType;
    }

    public void setTrasactionType(String trasactionType) {
        this.trasactionType = trasactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", trasactionType='" + trasactionType + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
