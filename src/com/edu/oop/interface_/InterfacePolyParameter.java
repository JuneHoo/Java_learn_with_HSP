package com.edu.oop.interface_;

import javax.swing.colorchooser.ColorChooserComponentFactory;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        // 接口的多态体现
        // 接口类型的变量 if01 可以指向实现了接口的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        // 继承体现的多态
        AAA a = new BBB();
        a = new CCC();
    }
}

interface IF {


}

class AAA {

}

class BBB extends AAA {
}

class CCC extends BBB {

}


class Monster implements IF {
}

class Car implements IF {

}