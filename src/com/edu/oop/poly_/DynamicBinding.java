package com.edu.oop.poly_;

public class DynamicBinding {
    public static void main(String[] args) {
        AAA a = new BBB();
        // 先从运行类型里找方法 找不到 就去父类里找
        // 动态绑定机制：当调用对象方法的时候 该方法会和该对象的内存地址/运行 绑定
        // 当调用对象属性时 没有动态绑定机制 哪里声名 哪里使用
        System.out.println(a.sum()); // 40 -- 30
        System.out.println(a.sum1()); // 30 -- 20

    }
}


class AAA {
    public int i = 10;
    public int sum() {
        return get() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int get() {
        return i;
    }
}

class BBB extends AAA {
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }

    public int get() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}