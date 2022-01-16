package com.edu.oop.InnerClass;

public class StaticInnerClass {
    // 成员内部类 静态内部类 本质还是成员 放在外部类的成员位置！！！
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        // 外部其他类 使用静态内部类的方式
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        // 编写一个方法 可以返回静态对象实例
        Outer10.Inner10 inner101 = outer10.getInner();
        System.out.println("===========");
        inner101.say();

        Outer10.Inner10 inner102 = outer10.getInner();
        inner102.say();

    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "Tom";
    private static void cry() {

    }

    // using static and put it in the variable position
    // 静态类访问外部的所有静态成员
    static class Inner10 {
        private static String name = "Mary";

        public void say() {
//            System.out.println(n1);
            System.out.println(name);
            cry();
        }
    }
    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner() {
        return new Inner10();
    }

    public static Inner10 getInner10() {
        return new Inner10();
    }

}