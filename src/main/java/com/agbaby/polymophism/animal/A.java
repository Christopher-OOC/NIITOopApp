package com.agbaby.polymophism.animal;

public class A {
    public static int numberCount;
}
 class B {

    public static void main(String[] args) {

        A a = new A();
        A.numberCount = 334;

        System.out.println("Count is: " + A.numberCount);
    }
}
