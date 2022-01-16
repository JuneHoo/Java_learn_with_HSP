package com.edu.oop.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

        // 包装类，String是final类 不能被继承
    }
}
// final 不能修饰构造器
// final类的方法 没必要加上final
final class AAA {
    public final void cry() {

    }
}

class BBB {
    // final和static结合使用 不会导致类加载 效率很高，底层做了优化
    public final static int num = 10000;
    static{
        System.out.println("BBB 静态代码被执行");
    }
}