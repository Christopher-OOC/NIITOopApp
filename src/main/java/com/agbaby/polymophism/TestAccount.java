package com.agbaby.polymophism;

public class TestAccount {

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(
                "John Doe",
                "test@test.com",
                "1234"
        );

        CurrentAccount ca2 = new CurrentAccount(
                "John Hops",
                "test@test.com",
                "1234"
        );

        ca.setBalance(1000);
        System.out.println(ca);
        System.out.println();
        System.out.println(ca2);

        System.out.println();

        ca.transfer(ca2, 250);

        System.out.println(ca);
        System.out.println();
        System.out.println(ca2);

//        ca.withdraw(500);
//        System.out.println(ca);
//
//        System.out.println();
//
//        ca.deposit(150);
//        System.out.println(ca);


    }
}
