package com.edu.oop.main_;

// 1.静态代码块和静态属性初始化调用优先级是一样的 如果有多个静态代码块和多个静态属性初始化 按他们定义的顺序调用
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private static int n1 = getN1();
    // 2.普通方法、普通普通代码块
    private int n2 = getN2();

    {
        System.out.println("A 普通代码块01");
    }
    private int getN2() {
        System.out.println("getN2被调用...");
        return 100;
    }

    static {
        System.out.println("A 静态代码块01");

    }

    public A() {
        // 3. 无参构造器最后执行！
        System.out.println("A的无参构造器");
    }

    public static int getN1() {
        System.out.println("getN1被调用...");
        return 100;
    }

}