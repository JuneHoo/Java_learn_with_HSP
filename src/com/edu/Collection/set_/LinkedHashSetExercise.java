package com.edu.Collection.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {
    // 是HashSet的子类 底层用链表维护顺序 使得插入的数据看起来有顺序

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("Audi", 1233333));
        linkedHashSet.add(new Car("mazida", 1233));
        linkedHashSet.add(new Car("mazida", 12333));
        linkedHashSet.add(new Car("BMW", 12333));

        linkedHashSet.add(new Car("Audi", 1233333));
        // 只有hashcode()和 equals() 都相同（重写） 才加不进去！
        System.out.println(linkedHashSet);
    }
}


class Car {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

}