package com.edu.oop;

public class HW05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

// 局部内部类
class A {
    // 若外部类的name和内部类的name重名怎么办？
    private String name = "hello";
    private String Name = "ta000";
    public void f1() {
        class B {
            private final String NAME = "Jake";
            public void show() {
                System.out.println("NAME=" + NAME + "外部类的name=" + name);
                System.out.println(A.this.Name);
            }
        }
        new B().show();
    }
}


