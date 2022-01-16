package com.edu.oop.abstract_;

public class Abstract01 {
//    abstract void eat();

    public static void main(String[] args) {
//        A a = new A(); // abstract class cannot be initialized

    }

}
// 抽象类不一定要包含抽象方法 还可以有实现的方法

abstract class A {
    public void hi() {
        System.out.println("Hi");
    }

}

abstract class E {
    public abstract void hi();
}

class F extends E {
    @Override
    public void hi() {

    }
}