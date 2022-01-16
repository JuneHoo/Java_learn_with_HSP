package com.edu.oop.final_;

public class Final01 {
    public static void main(String[] args) {

        E e = new E();
//        e.TAX_RATE = 1;
    }
}


class A {

}

class B extends A {

}

class C {
    public void hi() {

    }
}

class D extends C {
    public void hi() {
        System.out.println("重写了C类的hi方法");
    }
}

class E {
    public final double TAX_RATE = 0.09;
}

class F {
    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}