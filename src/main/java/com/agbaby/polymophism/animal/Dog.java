package com.agbaby.polymophism.animal;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public String sound() {
        return "Bark!";
    }

    public String dogSpeed() {
       return "4 km/h";
    }
}
