package com.agbaby.objects;

public class Bicycle extends Vehicle {
    private boolean isPeddling = true;

    public Bicycle(String color, int weight) {
        super(2, 1, color);
        setWeight(weight);

    }

    public boolean isPeddling() {
        return isPeddling;
    }

    @Override
    public void carryPassangers() {
        System.out.println("Bicycle can carry " + getNumberrOfSeats() + " passengers!");
    }

    @Override
    public void carryLuggages() {
        System.out.println("Bicycle can carry luggages!");
    }
}
