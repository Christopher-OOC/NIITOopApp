package com.agbaby.objects;

public class TestVehicle1 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("BLACK", 64);
        System.out.println("BICYCLE...");
        bicycle.carryPassangers();
        bicycle.carryLuggages();
        System.out.println();

        Account account = new Account();

        Car car = new Car("RED", 450);
        System.out.println("CAR...");
        car.carryPassangers();
        car.carryLuggages();

    }
}
