package com.Abstract_Interface;
public interface Swimable {
    // Method swim of interface Swimable
    void swim();
}

abstract class Animal {
    // Method abstract makeSound of class Animal
    abstract void makeSound();
}

// Dog class extending Animal and implementing Swimable
class Dog extends Animal implements Swimable {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    @Override
    public void swim() {
        System.out.println("Dog swims");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.swim();
    }
}
