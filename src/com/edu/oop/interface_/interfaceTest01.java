package com.edu.oop.interface_;

public class interfaceTest01 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

interface interface01 {
    public int n1 = 10;

    public void hi();

    default public void ok() {
        // jdk8以后 interface中可以有具体方法 需要加default static
    }
    public static void cry() {
        System.out.println("cry!");
    }
}

class A implements interface01 {


    @Override
    public void hi() {
        System.out.println("Hi!");
    }
}
