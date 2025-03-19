package com.agbaby.polymophism.animal;

public class Animal {
    private String name;
    public static int numberOfAnimalCreated;

    protected Animal(String name) {
        this.name = name;
        numberOfAnimalCreated++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sound() {
        eatAnimal();
        System.out.println("The number is " + numberOfAnimalCreated);
        return "Please provide the animal sound!";
    }

    public static void eatAnimal() {
        //sound();
        //System.out.println("The name is " + name);
        System.out.println("Oh, its meat is delicious!");
    }
}
