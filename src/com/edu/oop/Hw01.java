package com.edu.oop;

public class Hw01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);
        System.out.println(car);
    }
}

class Car {
    double price = 10;
    static String color = "white";

    public Car() {
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
//        this.color =
    }
    public String toString() {
        return price + "\t" + color;
    }
}
