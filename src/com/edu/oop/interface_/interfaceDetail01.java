package com.edu.oop.interface_;

public class interfaceDetail01 {

}


interface IA {
    // 接口中所有方法都是public的
    void say();

    void hi();
}

class Cat implements IA {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA {
    // 抽象类实现接口时 可以不实现抽象方法

}

