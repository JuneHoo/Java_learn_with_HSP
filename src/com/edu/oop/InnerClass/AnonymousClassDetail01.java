package com.edu.oop.InnerClass;

public class AnonymousClassDetail01 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f();

        System.out.println("main outer05 hashcode= " + outer05);
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");

    }

    protected void ok(String str) {
        System.out.println("Peron ok()" + str);
    }
}

class Outer05 {
    private int n1 = 99;
    public void f() {
        // 不能添加访问修饰符 它的地位是一个局部变量
        // 作用域：仅仅在定义它的方法或代码块中 Outer05$1

        Person p = new Person() {
            private int n1 = 8;
            public void hi() {
                System.out.println("匿名内部类重写的hi方法 and n1 = " + n1 + " 外部类的n1= " + Outer05.this.n1);
                // Outer05.this就是调用 f1的对象
                System.out.println("outer05.this hashcode is = " + Outer05.this);

            }
        };
        p.hi();

        new Person(){
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");
            }

            public void ok(String str) {
                super.ok(str);
            }
        };
    }
}
