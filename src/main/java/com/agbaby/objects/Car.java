package com.agbaby.objects;

public class Car extends Vehicle {
    private boolean isReversible = true;

    public Car(String color, int weight)  {
        super(4, 4, color);
        setWeight(weight);

    }

    public boolean isReversible() {
        return isReversible;
    }

    public void carryPassangers() {
        System.out.println("Car can carry " + getNumberrOfSeats() + " passengers!");
    }

    public void carryLuggages() {
        System.out.println("Car can carry luggages!");
    }
}
