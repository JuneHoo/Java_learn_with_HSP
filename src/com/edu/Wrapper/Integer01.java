package com.edu.Wrapper;

public class Integer01 {
    public static void main(String[] args) {
        // Show that auto-boxing and auto-unboxing
        // 手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        int i = integer.intValue();

        // jdk5以后 就可以自动拆箱和装箱
        int n2 = 200;
        Integer integer2 = n2; // 底层使用的是Integer.valueOf(n2)
        int n3 = integer2;


    }
}
