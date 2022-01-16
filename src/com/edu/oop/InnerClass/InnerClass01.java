package com.edu.oop.InnerClass;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
//        Outer.Inner inner = new Outer.Inner();
        System.out.println("outer's hashcode is: " + outer);

    }
}

class Outer {
    private int n1 = 100;

    String name = "Jack";

    public void m1() {
        System.out.println("m1()");
        // 局部内部类定义在方法中/代码块中
        class Inner02 {
            private int n1 = 800;
            public void f() {
                System.out.println("This is the f in Inner02");
                // Outer.this 本质是外部类的对象
                System.out.println("n1 = " + n1 + " 外部的n1 + " + Outer.this.n1);
                System.out.println("Outer.this hashcode: " + Outer.this);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f();
    }

    {
        System.out.println("代码块");
        class Inner03 {

        }
    }

    public Outer() {
    }

    public Outer(int n1) {
        this.n1 = n1;
    }

    class Inner {
        // 内部类(相当于局部变量) 不能添加访问修饰符 但是可以加final
        public void f1() {
            System.out.println("This is f1()");
            System.out.println(n1);
        }

    }

}
