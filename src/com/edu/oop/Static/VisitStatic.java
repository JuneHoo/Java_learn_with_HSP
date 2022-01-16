package com.edu.oop.Static;

public class VisitStatic {
    public static void main(String[] args) {
        // 类变量是随着类的加载而创建的 即使没有创建对象实例 也可以访问
        System.out.println(A.name);
        A a = new A();
        System.out.println(A.name);
    }

}

class A {
    public static String name = "Edu";
}
