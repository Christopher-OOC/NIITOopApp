package com.agbaby.objects;

public class Vehicle {
    private int numberOfWheels;
    private int numberrOfSeats;
    private String color;
    private int weight;

    public Vehicle() {

    }

    public Vehicle(int numberOfWheels, int numberrOfSeats, String color) {
        this.numberOfWheels = numberOfWheels;
        this.numberrOfSeats = numberrOfSeats;
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberrOfSeats() {
        return numberrOfSeats;
    }

    public void setNumberrOfSeats(int numberrOfSeats) {
        this.numberrOfSeats = numberrOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void carryPassangers() {
        System.out.println("Vehicle can carry " + numberrOfSeats + " passengers!");
    }

    public void carryLuggages() {
        System.out.println("Vehicle can carry luggages!");
    }

}
