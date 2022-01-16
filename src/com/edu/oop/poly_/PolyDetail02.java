package com.edu.oop.poly_;

import java.sql.SQLOutput;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub(); // 向上转型
        // 属性没有重写一说
        System.out.println(base.count); // 属性的值看编译类型！！！
        Sub sub = new Sub();

        System.out.println(sub.count);
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;

}

