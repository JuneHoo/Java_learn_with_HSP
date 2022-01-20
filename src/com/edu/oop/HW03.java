package com.edu.oop;

public class HW03 {
    // OOP advance
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.shout();
        cat.shout();
    }

}


abstract class Animal {
    public abstract void shout();

}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("I am a catty");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("I am a puppy");
    }
}