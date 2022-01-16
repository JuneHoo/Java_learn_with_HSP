package com.edu.oop.SingleTon01;

// 懒汉式：单例模式
public class SingleTon01 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance.toString());

        // 再次调用getinstance 构造器不会调用两次
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
    }
}


// 希望在程序运行过程中 只能创建一个Cat对象
class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    // 将构造器私有化
    // 定义一个静态属性对象
    // 提供一个public的static方法 可以返回一个Cat对象
    private Cat(String name) {
        this.name = name;
        System.out.println("Constructor was called");
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }


}
