package com.edu.oop.poly_;

import com.sun.scenario.effect.Flood;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
// 编译类型是Animal 那么可以传进去Animal的子类

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }
    public void eat() {
        System.out.println("Animal is eating!!");
    }

    public void cry() {
        System.out.println("Animal is crying...");
    }

    public void run() {
        System.out.println("Running~");
    }

}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating~");
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }
    public void catchMouse() {
        System.out.println("catching~");
    }
    public void run() {
        System.out.println("Cat is running");
    }

    public void cry() {
        System.out.println("Cat cries...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public Dog() {

    }

    public void cry() {
        System.out.println("Dog cries...");
    }
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
//        System.out.println(name);
    }

    public Pig() {
        super();
    }
}

class Food {
    public void feed() {
        System.out.println("Feeding~");
    }
}
class Rice extends Food {
    public Rice() {
    }

    public void feed() {
        System.out.println("Feeding Rice~");
    }

}