package com.agbaby.objects;

public class TestAccounts {
    public static void main(String[] args) {

        Account saving = new Account(
                "John",
                "Doe",
                "23234553545",
                "SAVINGS"
        );

        Account current = new Account(
                "Johnny",
                "Doe",
                "23234553545",
                "CURRENT"
        );

        int x = 2;
        String s = "hello";

        System.out.println(x);
        System.out.println(s);
        System.out.println(saving);
        System.out.println(current);
    }
}
