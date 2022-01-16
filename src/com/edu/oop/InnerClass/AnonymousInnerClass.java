package com.edu.oop.InnerClass;

public class AnonymousInnerClass {
    private int n1 = 10;
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();

        // 基于接口的匿名内部类
        // 若类Tiger和类Dog只使用一次 可以用匿名内部类
        // 编译看左边 运行看右边 tiger的编译类型是A 运行类型是 匿名内部类（没有名字只有定义）
        // jdk底层在创建匿名内部类 AnonymousInnerClass$1，立即就创建了Outer04实例，
        // 并把地址返回给tiger

        A tiger = new A() {
            @Override
            public void cry() {
                System.out.println("Tiger wow~");
            }
        };
        System.out.println("tiger's runtime type is: " + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        System.out.println();
        // 类的匿名内部类
        // father对象的 运行类型是AnonymousInnerClass$1
        Father father = new Father("jack"){
            public void test() {
                System.out.println("匿名内部类重写的test");
            }
        };
        System.out.println(father.getClass());
        father.test();

        // 基于抽象类的匿名内部类
        Animal animal = new Animal() {

            @Override
            public void eat() {
                System.out.println("Dog is eating bones.");
            }
        };
        animal.eat();
    }
}


class Outer04 {
    private int n1 = 10;
    public void method() {

    }
}

class Father {
    public Father(String name) {
    }
    public void test() {

    }

}

abstract class Animal {
    public abstract void eat();
}

interface A {
    void cry();
}

//class Tiger implements A {
//    @Override
//    public void cry() {
//        System.out.println("Tiger wow~");
//    }
//}
//
//class Dog implements A {
//
//
//    @Override
//    public void cry() {
//        System.out.println("Dog wow~");
//    }
//}