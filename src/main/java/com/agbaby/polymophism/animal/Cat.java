package com.agbaby.polymophism.animal;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    @Override
    public String sound() {
        return "Meow!";
    }

    public String catSpeed() {
        return "1 km/h";
    }
}
