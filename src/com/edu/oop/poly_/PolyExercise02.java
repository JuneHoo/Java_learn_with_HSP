package com.edu.oop.poly_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub02 sub02 = new Sub02();
        System.out.println(sub02.count);

        sub02.display();
        Base02 base02 = sub02;
        System.out.println(base02 == sub02);
        System.out.println(base02.count); // 属性的值看编译类型

        base02.display(); // 运行看右边
    }
}


class Base02 {
    int count = 10;
    public void display() {
        System.out.println(this.count);

    }
}

class Sub02 extends Base02 {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}