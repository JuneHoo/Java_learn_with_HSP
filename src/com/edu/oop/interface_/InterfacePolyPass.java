package com.edu.oop.interface_;
/*
多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        // 接口类型的变量可以指向 实现了该接口的类的对象实例
        IG ig = new Teacher();
        IH ih = new Teacher();


    }
}

interface IH extends IG {
    void hi();
}

interface IG{}

class Teacher implements IH {
    @Override
    public void hi() {

    }
}
