package com.edu.generic_;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("BMW", 100); // 当调用方式时 传入参数 编译器就能确定类型

        Fish<String, ArrayList> stringArrayListFish = new Fish<>();
//        Fish fish = stringArrayListFish;
        stringArrayListFish.hello(new ArrayList(), 11.3f);
    }
}
// 泛型方法 可以定义在普通类种 也可以定义在泛型类中
class Car {
    public void run() {
    }

    // 1. <T,R> 就是泛型
    // 2. 是提供给fly使用的
    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass()); // 100 自动装箱 变成了Integer！
    }
}

class Fish<T, R> {
    public void run() {

    }
    public <U, M> void eat(U u, M m) {

    }
    // hi is not a generic method 只是使用了类声明的泛型
    public void hi(T t) {
    }

    // 泛型方法可以使用类声明的泛型 也可使用自己声名的
    public<K> void hello(R r, K k) {
        System.out.println(r.getClass()); // ArrayList
        System.out.println(k.getClass()); // Float!
    }
}


