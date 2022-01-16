package com.edu.oop.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.a1);
    }
}


interface IB {
    // 接口中的属性 只能是final static的
    void hi();
    int a1 = 1;  // public static final int a1 = 1;

}

interface IC {
    void say();
}

// 接口不能继承其他类 可以继承多个接口
interface ID extends IB, IC {


}
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}