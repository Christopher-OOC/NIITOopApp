package com.agbaby.polymophism.animal;

import javax.naming.NamingEnumeration;

public class TestAnimal {

//    private static final Animal testAnimal = new Animal("TEST");

    public static void main(String[] args) {
 //        final Animal testAnimal = new Animal("TEST");
//        Cat cat = new Cat();
//        Dog dog = new Dog();

 //       testAnimal.setName("Test 2");

        Animal cat = new Cat();
        System.out.println("You have created " + Animal.numberOfAnimalCreated + " animals");

        Dog dog  = new Dog();

        produceAnimalSound(cat);
        produceAnimalSound(dog);

        System.out.println("You have created " + dog.numberOfAnimalCreated + " animals");
        //produceAnimalSound(testAnimal);
    }

    private static void produceAnimalSound(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            System.out.println(cat.getName() + " sounds " + cat.sound() + " with speed " +
                    cat.catSpeed());

            return;
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            System.out.println(dog.getName() + " sounds " + dog.sound() + " with speed " +
                    dog.dogSpeed());

            return;
        }
        if (animal instanceof Animal) {
            System.out.println(animal.getName() + " sounds " + animal.sound());
            return;
        }
    }

//    private static void produceAnimalSound(Cat cat) {
//        System.out.println(cat.getName() + " sounds " + cat.sound());
//    }
//
//    private static void produceAnimalSound(Dog dog) {
//        System.out.println(dog.getName() + " sounds " + dog.sound());
//    }
}
