package com.edu.oop.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a.say();
        b.say();
        System.out.println(a.sum(1, 2));
    }
}

class B {
    public void say() {
        System.out.println("B say() ");
    }
}

class A extends B {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say() ");
    }
}
