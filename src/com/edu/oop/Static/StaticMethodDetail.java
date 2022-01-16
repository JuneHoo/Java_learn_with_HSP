package com.edu.oop.Static;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        new D().say();
    }
}

class D {
    public int n1 = 100;
    public static int n2 = 200;
    public void say() {

    }

    public static void hi() {
        // 类方法\静态方法中不允许使用和对象有关的关键字 this super 等
        // 静态方法只能访问静态成员
//        System.out.println(n1);
        System.out.println(n2);
//        D.say();
    }

    public static void hello() {


    }

    public void ok() {
        // 普通成员方法既可以访问非静态也可以访问非静态
        System.out.println(n1 + " " + n2);
        say();
        hi();

    }
}