package com.edu.oop.Object_;

public class Finalize_ {
    public static void main(String[] args) throws Throwable {
        Car bmw = new Car("宝马");
        bmw = null; // 这时 bmw 就是个辣鸡 垃圾回收器会自动回收（销毁）
        // 在销毁对象前 会调用该对象的finalize方法 可以在finalize中 写自己的逻辑代码
        // i.e: 释放资源：数据库连结 打开文件
        // 如果不重写 finalize 就会调用Object类的finalize 即默认处理

        // 会有辣鸡回收算法：gc算法 不会立马finalize（一直监控 效率低下）
        // 也可以 主动调用
        System.gc();
        System.out.println("Program exit");

    }
}


class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁 汽车" + name);
        System.out.println("我们释放某些资源。。。");

    }

}