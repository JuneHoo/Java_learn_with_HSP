package com.edu.oop.poly_;

public class PolyDetail {
    public static void main(String[] args) {
        // 父类类型引用名 = new 子类类型
        // 向上转型：父类的引用指向了子类的对象
        Animal animal = new Cat();
        Object obj = new Cat();
        // 可以调用父类的所有成员 但需要遵守访问权限
        // 但是不能调用子类的特有成员
        // 因为在编译阶段 能调用哪些成员 是由编译类型决定的
//        animal.run();  run是cat的特有方法
        // 最终运行效果看子类实现 即调用方法时 按照从子类开始查找方法 然后调用
        animal.eat();
        animal.cry();
        animal.run();
        // 多态的向下转型 语法：
        Cat cat = (Cat) animal; // 运行类型变成了Cat
        // 要求父类的引用必须指向的是当前目标类型的对象

        cat.catchMouse();
        System.out.println("ok~");
    }
}
