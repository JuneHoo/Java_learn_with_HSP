package com.edu.reflection_;

import javax.naming.Name;

public class Car {
    public String brand = "BMW";
    public int price = 600000;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
