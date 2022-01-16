package com.edu.oop.Static;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.n1);

//        C c = new C();
        System.out.println(C.address);
    }
}

class B {
    public static int n1 = 100;
}

class C {
    public static String address = "Peking";
}
